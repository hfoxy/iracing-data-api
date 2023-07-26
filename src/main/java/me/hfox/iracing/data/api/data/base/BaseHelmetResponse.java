package me.hfox.iracing.data.api.data.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseHelmetResponse {

    protected long pattern;
    protected String color1;
    protected String color2;
    protected String color3;

    @JsonProperty("face_type")
    protected long faceType;

    @JsonProperty("helmet_type")
    protected long helmetType;

    public long getPattern() {
        return pattern;
    }

    public void setPattern(long pattern) {
        this.pattern = pattern;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getColor3() {
        return color3;
    }

    public void setColor3(String color3) {
        this.color3 = color3;
    }

    public long getFaceType() {
        return faceType;
    }

    public void setFaceType(long faceType) {
        this.faceType = faceType;
    }

    public long getHelmetType() {
        return helmetType;
    }

    public void setHelmetType(long helmetType) {
        this.helmetType = helmetType;
    }

    @Override
    public String toString() {
        return "BaseHelmetResponse{" +
                "pattern=" + pattern +
                ", color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                ", color3='" + color3 + '\'' +
                ", faceType=" + faceType +
                ", helmetType=" + helmetType +
                '}';
    }

}
