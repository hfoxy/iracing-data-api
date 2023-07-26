package me.hfox.iracing.data.api.data.member;

import me.hfox.iracing.data.api.data.base.BaseHelmetResponse;

public class MemberHelmetResponse extends BaseHelmetResponse {

    @Override
    public String toString() {
        return "MemberHelmetResponse{" +
                "pattern=" + pattern +
                ", color1='" + color1 + '\'' +
                ", color2='" + color2 + '\'' +
                ", color3='" + color3 + '\'' +
                ", faceType=" + faceType +
                ", helmetType=" + helmetType +
                '}';
    }

}
