package me.hfox.iracing.data.api.data.carclass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CarInClassResponse {

    @JsonProperty("car_dirpath")
    private String carDirpath;

    @JsonProperty("car_id")
    private long carId;

    @JsonProperty("retired")
    private boolean retired;

    public String getCarDirpath() {
        return carDirpath;
    }

    public void setCarDirpath(String carDirpath) {
        this.carDirpath = carDirpath;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    @Override
    public String toString() {
        return "CarInClassResponse{" +
                "carDirpath='" + carDirpath + '\'' +
                ", carId=" + carId +
                ", retired=" + retired +
                '}';
    }

}
