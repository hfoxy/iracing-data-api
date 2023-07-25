package me.hfox.iracing.data.api.service.car;

import me.hfox.iracing.data.api.data.RedirectLinkResponse;
import me.hfox.iracing.data.api.data.car.CarResponse;
import me.hfox.iracing.data.api.data.carclass.CarClassResponse;
import me.hfox.iracing.data.api.exception.IRacingDataException;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

@Service
public class CarServiceImpl implements CarService {

    private final AuthService authService;

    public CarServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public List<CarResponse> getCars() {
        WebClient client = authService.getAuthenticatedClient();
        ResponseEntity<RedirectLinkResponse> redirectResponse = client.get().uri("/data/car/get").retrieve()
                .toEntity(RedirectLinkResponse.class).block();

        RedirectLinkResponse redirect = Objects.requireNonNull(Objects.requireNonNull(redirectResponse).getBody());

        URI uri;
        try {
            uri = new URI(redirect.getLink());
        } catch (URISyntaxException ex) {
            throw new IRacingDataException("invalid link uri", ex);
        }

        ResponseEntity<List<CarResponse>> response = authService.getClient().get().uri(uri).retrieve()
                .toEntityList(CarResponse.class).block();

        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

    @Override
    public List<CarClassResponse> getCarClasses() {
        WebClient client = authService.getAuthenticatedClient();
        ResponseEntity<RedirectLinkResponse> redirectResponse = client.get().uri("/data/carclass/get").retrieve()
                .toEntity(RedirectLinkResponse.class).block();

        RedirectLinkResponse redirect = Objects.requireNonNull(Objects.requireNonNull(redirectResponse).getBody());

        URI uri;
        try {
            uri = new URI(redirect.getLink());
        } catch (URISyntaxException ex) {
            throw new IRacingDataException("invalid link uri", ex);
        }

        ResponseEntity<List<CarClassResponse>> response = authService.getClient().get().uri(uri).retrieve()
                .toEntityList(CarClassResponse.class).block();

        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

}
