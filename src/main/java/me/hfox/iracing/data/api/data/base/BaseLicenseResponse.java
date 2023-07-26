package me.hfox.iracing.data.api.data.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BaseLicenseResponse {

    @JsonProperty("category_id")
    protected long categoryId;
    protected String category;

    @JsonProperty("license_level")
    protected long licenseLevel;

    @JsonProperty("safety_rating")
    protected double safetyRating;
    protected double cpi;
    protected long irating;
    protected long ttRating;

    @JsonProperty("mpr_num_races")
    protected long mprNumRaces;
    protected String color;

    @JsonProperty("group_name")
    protected String groupName;

    @JsonProperty("group_id")
    protected long groupId;

    @JsonProperty("pro_promotable")
    protected boolean proPromotable;

    @JsonProperty("mpr_num_tts")
    protected long mprNumTts;

    public long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(long categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public long getLicenseLevel() {
        return licenseLevel;
    }

    public void setLicenseLevel(long licenseLevel) {
        this.licenseLevel = licenseLevel;
    }

    public double getSafetyRating() {
        return safetyRating;
    }

    public void setSafetyRating(double safetyRating) {
        this.safetyRating = safetyRating;
    }

    public double getCpi() {
        return cpi;
    }

    public void setCpi(double cpi) {
        this.cpi = cpi;
    }

    public long getIrating() {
        return irating;
    }

    public void setIrating(long irating) {
        this.irating = irating;
    }

    public long getTtRating() {
        return ttRating;
    }

    public void setTtRating(long ttRating) {
        this.ttRating = ttRating;
    }

    public long getMprNumRaces() {
        return mprNumRaces;
    }

    public void setMprNumRaces(long mprNumRaces) {
        this.mprNumRaces = mprNumRaces;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public long getGroupId() {
        return groupId;
    }

    public void setGroupId(long groupId) {
        this.groupId = groupId;
    }

    public boolean isProPromotable() {
        return proPromotable;
    }

    public void setProPromotable(boolean proPromotable) {
        this.proPromotable = proPromotable;
    }

    public long getMprNumTts() {
        return mprNumTts;
    }

    public void setMprNumTts(long mprNumTts) {
        this.mprNumTts = mprNumTts;
    }

    @Override
    public String toString() {
        return "BaseLicenseResponse{" +
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
