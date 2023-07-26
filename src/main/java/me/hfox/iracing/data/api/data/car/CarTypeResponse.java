package me.hfox.iracing.data.api.data.car;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarTypeResponse {

    @JsonProperty("car_type")
    private String carType;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "CarTypeResponse{" +
                "carType='" + carType + '\'' +
                '}';
    }

}
