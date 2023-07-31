package me.hfox.iracing.data.api.service.auth;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import me.hfox.iracing.data.api.data.RedirectLinkResponse;
import me.hfox.iracing.data.api.data.auth.AuthRequest;
import me.hfox.iracing.data.api.data.auth.AuthResponse;
import me.hfox.iracing.data.api.data.base.ErrorResponse;
import me.hfox.iracing.data.api.exception.IRacingAuthenticationException;
import me.hfox.iracing.data.api.exception.IRacingDataException;
import me.hfox.iracing.data.api.exception.IRacingRequestDataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.http.codec.ClientCodecConfigurer;
import org.springframework.http.codec.json.Jackson2JsonDecoder;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriBuilder;
import reactor.core.publisher.Mono;

import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;

@Service
public class AuthServiceImpl implements AuthService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthServiceImpl.class);

    private static final String ROOT_URI = "https://members-ng.iracing.com/";

    private final MessageDigest sha256;

    private final WebClient unauthenticatedClient;
    private final ExchangeStrategies exchangeStrategies;
    private final WebClient standardClient;
    private WebClient client;
    private LocalDateTime authExpiry;

    public AuthServiceImpl() throws NoSuchAlgorithmException {
        this.sha256 = MessageDigest.getInstance("SHA-256");

        ObjectMapper mapper = Jackson2ObjectMapperBuilder.json().build();
        mapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        mapper.registerModule(new JavaTimeModule());

        this.exchangeStrategies = ExchangeStrategies.builder().codecs(configurer -> {
            ClientCodecConfigurer.ClientDefaultCodecs codecs = configurer.defaultCodecs();
            codecs.jackson2JsonDecoder(new Jackson2JsonDecoder(mapper));
            codecs.maxInMemorySize(1024*1024);
        }).build();

        this.unauthenticatedClient = WebClient.builder().baseUrl(ROOT_URI)
                .exchangeStrategies(exchangeStrategies).build();

        this.standardClient = WebClient.builder().exchangeStrategies(exchangeStrategies).build();
    }

    @Override
    public boolean isAuthenticated() {
        if (client == null || authExpiry == null) {
            return false;
        }

        return !LocalDateTime.now().isAfter(authExpiry);
    }

    @Override
    public WebClient getAuthenticatedClient() {
        if (client == null) {
            throw new IRacingAuthenticationException("no authentication details provided");
        }

        return client;
    }

    @Override
    public WebClient getClient() {
        return standardClient;
    }

    @Override
    public void login(String email, String password) {
        String auth = password + email.toLowerCase();
        byte[] encodedHash = sha256.digest(auth.getBytes(StandardCharsets.UTF_8));
        String encodedPassword = Base64.getEncoder().encodeToString(encodedHash);
        WebClient.ResponseSpec responseSpec = unauthenticatedClient.post().uri("/auth").body(
                Mono.just(new AuthRequest(email, encodedPassword)), AuthRequest.class
        ).retrieve();

        ResponseEntity<AuthResponse> response = responseSpec.toEntity(AuthResponse.class).block(Duration.ofSeconds(5));
        if (response == null || response.getBody() == null) {
            throw new IRacingAuthenticationException("invalid response");
        }

        if (response.getStatusCode().is5xxServerError()) {
            throw new IRacingAuthenticationException("unexpected error");
        }

        if (response.getStatusCode().is4xxClientError() || response.getBody().getAuthcode().equals("0")) {
            throw new IRacingAuthenticationException("unauthorized");
        }

        List<String> cookieStrings = Objects.requireNonNull(response.getHeaders().get(HttpHeaders.SET_COOKIE));
        List<HttpCookie> cookies = cookieStrings.stream().map(HttpCookie::parse)
                .collect(ArrayList::new, List::addAll, List::addAll);;

        var builder = WebClient.builder().baseUrl(ROOT_URI);
        for (HttpCookie cookie : cookies) {
            builder = builder.defaultCookie(cookie.getName(), cookie.getValue());
            if (cookie.getName().equalsIgnoreCase("authtoken_members")) {
                authExpiry = LocalDateTime.now().plus(Duration.ofSeconds(cookie.getMaxAge()));
            }
        }

        if (authExpiry == null) {
            throw new IRacingAuthenticationException("no authtoken cookie provided");
        }

        client = builder.exchangeStrategies(exchangeStrategies).build();
        LOGGER.info("Logged in! Expires: {}", authExpiry);
    }

    @Override
    public void logout() {
        client = null;
        authExpiry = null;
    }

    @Override
    public WebClient.ResponseSpec getRedirectResponse(String uri, Map<String, Object> queryParams) {
        WebClient.RequestHeadersSpec<?> spec;
        if (queryParams != null && !queryParams.isEmpty()) {
            Function<UriBuilder, URI> function = uriBuilder -> {
                uriBuilder = uriBuilder.path(uri);
                for (Entry<String, Object> entry : queryParams.entrySet()) {
                    uriBuilder = uriBuilder.queryParam(entry.getKey(), entry.getValue());
                }

                return uriBuilder.build();
            };

            spec = getAuthenticatedClient().get().uri(function);
        } else {
            spec = getAuthenticatedClient().get().uri(uri);
        }

        ResponseEntity<RedirectLinkResponse> redirectResponse = spec.retrieve().onStatus(
                        HttpStatusCode::is4xxClientError,
                        clientResponse -> clientResponse.toEntity(ErrorResponse.class)
                                .map(response -> new IRacingRequestDataException(
                                        Objects.requireNonNull(response.getBody())
                                ))
                ).toEntity(RedirectLinkResponse.class).block();

        RedirectLinkResponse redirect = Objects.requireNonNull(Objects.requireNonNull(redirectResponse).getBody());

        URI redirectUri;
        try {
            redirectUri = new URI(redirect.getLink());
        } catch (URISyntaxException ex) {
            throw new IRacingDataException("invalid link uri", ex);
        }

        return getClient().get().uri(redirectUri).retrieve();
    }

}
