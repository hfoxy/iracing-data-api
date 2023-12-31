package me.hfox.iracing.data.api.data.team;

import me.hfox.iracing.data.api.data.base.BaseHelmetResponse;

public class TeamHelmetResponse extends BaseHelmetResponse {

    @Override
    public String toString() {
        return "TeamHelmetResponse{" +
                "pattern=" + pattern +
                ", color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                ", color3='" + color3 + '\'' +
                ", faceType=" + faceType +
                ", helmetType=" + helmetType +
                '}';
    }

}
