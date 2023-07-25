package me.hfox.iracing.data.api.service.car;

import me.hfox.iracing.data.api.data.car.CarResponse;
import me.hfox.iracing.data.api.data.carclass.CarClassResponse;

import java.util.List;

public interface CarService {

    List<CarResponse> getCars();

    List<CarClassResponse> getCarClasses();

}
