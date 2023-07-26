package me.hfox.iracing.data.api.service.auth;

import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;
import java.util.Map;

public interface AuthService {

    boolean isAuthenticated();

    WebClient getAuthenticatedClient();

    WebClient getClient();

    void login(String email, String password);

    void logout();

    default WebClient.ResponseSpec getRedirectResponse(String uri) {
        return getRedirectResponse(uri, new HashMap<>());
    }

    WebClient.ResponseSpec getRedirectResponse(String uri, Map<String, Object> queryParams);

}
