package me.hfox.iracing.data.api.data.team;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TeamDriverLicenseResponse {

    @JsonProperty("category_id")
    private long categoryId;
    private String category;

    @JsonProperty("license_level")
    private long licenseLevel;

    @JsonProperty("safety_rating")
    private double safetyRating;
    private double cpi;
    private long irating;
    private long ttRating;

    @JsonProperty("mpr_num_races")
    private long mprNumRaces;
    private String color;

    @JsonProperty("group_name")
    private String groupName;

    @JsonProperty("group_id")
    private long groupId;

    @JsonProperty("pro_promotable")
    private boolean proPromotable;

    @JsonProperty("mpr_num_tts")
    private long mprNumTts;

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

}
