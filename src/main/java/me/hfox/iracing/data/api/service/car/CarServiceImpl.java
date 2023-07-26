package me.hfox.iracing.data.api.service.car;

import me.hfox.iracing.data.api.data.car.CarResponse;
import me.hfox.iracing.data.api.data.carclass.CarClassResponse;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
        ResponseEntity<List<CarResponse>> response = authService.getRedirectResponse("/data/car/get")
                .toEntityList(CarResponse.class).block();

        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

    @Override
    public List<CarClassResponse> getCarClasses() {
        ResponseEntity<List<CarClassResponse>> response = authService.getRedirectResponse("/data/carclass/get")
                .toEntityList(CarClassResponse.class).block();

        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

}
