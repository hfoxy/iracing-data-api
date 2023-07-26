package me.hfox.iracing.data.api.data.carclass;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CarClassResponse {

    @JsonProperty("car_class_id")
    private long carClassId;

    @JsonProperty("cars_in_class")
    private List<CarInClassResponse> carsInClass;

    @JsonProperty("cust_id")
    private long custId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("relative_speed")
    private long relativeSpeed;

    @JsonProperty("short_name")
    private String shortName;

    public long getCarClassId() {
        return carClassId;
    }

    public void setCarClassId(long carClassId) {
        this.carClassId = carClassId;
    }

    public List<CarInClassResponse> getCarsInClass() {
        return carsInClass;
    }

    public void setCarsInClass(List<CarInClassResponse> carsInClass) {
        this.carsInClass = carsInClass;
    }

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRelativeSpeed() {
        return relativeSpeed;
    }

    public void setRelativeSpeed(long relativeSpeed) {
        this.relativeSpeed = relativeSpeed;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "CarClassResponse{" +
                "carClassId=" + carClassId +
                ", carsInClass=" + carsInClass +
                ", custId=" + custId +
                ", name='" + name + '\'' +
                ", relativeSpeed=" + relativeSpeed +
                ", shortName='" + shortName + '\'' +
                '}';
    }

}
