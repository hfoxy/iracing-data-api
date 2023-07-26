package me.hfox.iracing.data.api.data.member;

import me.hfox.iracing.data.api.data.base.BaseLicenseResponse;

public class MemberLicenseResponse extends BaseLicenseResponse {

    @Override
    public String toString() {
        return "MemberLicenseResponse{" +
                "categoryId=" + categoryId +
                ", category='" + category + '\'' +
                ", licenseLevel=" + licenseLevel +
                ", safetyRating=" + safetyRating +
                ", cpi=" + cpi +
                ", irating=" + irating +
                ", ttRating=" + ttRating +
                ", mprNumRaces=" + mprNumRaces +
                ", color='" + color + '\'' +
                ", groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", proPromotable=" + proPromotable +
                ", mprNumTts=" + mprNumTts +
                '}';
    }

}
