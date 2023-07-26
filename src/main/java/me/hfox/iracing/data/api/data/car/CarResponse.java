package me.hfox.iracing.data.api.data.car;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.data.api.util.Constants;

import java.time.ZonedDateTime;
import java.util.List;

public class CarResponse {

    @JsonProperty("ai_enabled")
    private boolean aiEnabled;

    @JsonProperty("allow_number_colors")
    private boolean allowNumberColors;

    @JsonProperty("allow_sponsor1")
    private boolean allowSponsor1;

    @JsonProperty("allow_sponsor2")
    private boolean allowSponsor2;

    @JsonProperty("allow_wheel_color")
    private boolean allowWheelColor;

    @JsonProperty("award_exempt")
    private boolean awardExempt;

    @JsonProperty("car_dirpath")
    private String carDirpath;

    @JsonProperty("car_id")
    private long carId;

    @JsonProperty("car_name")
    private String carName;

    @JsonProperty("car_name_abbreviated")
    private String carNameAbbreviated;

    @JsonProperty("car_types")
    private List<CarTypeResponse> carTypes;

    @JsonProperty("car_weight")
    private long carWeight;

    @JsonProperty("categories")
    private List<String> categories;

    @JsonProperty("created")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime created;

    @JsonProperty("first_sale")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime firstSale;

    @JsonProperty("forum_url")
    private String forumUrl;

    @JsonProperty("free_with_subscription")
    private boolean freeWithSubscription;

    @JsonProperty("has_headlights")
    private boolean headlights;

    @JsonProperty("has_multiple_dry_tyre_types")
    private boolean multipleDryTyreTypes;

    @JsonProperty("hp")
    private long hp;

    @JsonProperty("is_ps_purchasable")
    private boolean psPurchasable;

    @JsonProperty("max_power_adjust_pct")
    private double maxPowerAdjustPercentage;

    @JsonProperty("max_weight_penalty_kg")
    private double maxWeightPenaltyKg;

    @JsonProperty("min_power_adjust_pct")
    private double minPowerAdjustPercentage;

    @JsonProperty("package_id")
    private long packageId;

    // @JsonProperty("paint_rules")
    // private Object paintRules;

    @JsonProperty("patterns")
    private long patterns;

    @JsonProperty("price")
    private double price;

    @JsonProperty("price_display")
    private String priceDisplay;

    @JsonProperty("retired")
    private boolean retired;

    @JsonProperty("search_filters")
    private String searchFilters;

    @JsonProperty("site_url")
    private String siteUrl;

    @JsonProperty("sku")
    private long sku;

    public boolean isAiEnabled() {
        return aiEnabled;
    }

    public void setAiEnabled(boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
    }

    public boolean isAllowNumberColors() {
        return allowNumberColors;
    }

    public void setAllowNumberColors(boolean allowNumberColors) {
        this.allowNumberColors = allowNumberColors;
    }

    public boolean isAllowSponsor1() {
        return allowSponsor1;
    }

    public void setAllowSponsor1(boolean allowSponsor1) {
        this.allowSponsor1 = allowSponsor1;
    }

    public boolean isAllowSponsor2() {
        return allowSponsor2;
    }

    public void setAllowSponsor2(boolean allowSponsor2) {
        this.allowSponsor2 = allowSponsor2;
    }

    public boolean isAllowWheelColor() {
        return allowWheelColor;
    }

    public void setAllowWheelColor(boolean allowWheelColor) {
        this.allowWheelColor = allowWheelColor;
    }

    public boolean isAwardExempt() {
        return awardExempt;
    }

    public void setAwardExempt(boolean awardExempt) {
        this.awardExempt = awardExempt;
    }

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

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String isCarNameAbbreviated() {
        return carNameAbbreviated;
    }

    public void setCarNameAbbreviated(String carNameAbbreviated) {
        this.carNameAbbreviated = carNameAbbreviated;
    }

    public List<CarTypeResponse> getCarTypes() {
        return carTypes;
    }

    public void setCarTypes(List<CarTypeResponse> carTypes) {
        this.carTypes = carTypes;
    }

    public long getCarWeight() {
        return carWeight;
    }

    public void setCarWeight(long carWeight) {
        this.carWeight = carWeight;
    }

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public ZonedDateTime getFirstSale() {
        return firstSale;
    }

    public void setFirstSale(ZonedDateTime firstSale) {
        this.firstSale = firstSale;
    }

    public String getForumUrl() {
        return forumUrl;
    }

    public void setForumUrl(String forumUrl) {
        this.forumUrl = forumUrl;
    }

    public boolean isFreeWithSubscription() {
        return freeWithSubscription;
    }

    public void setFreeWithSubscription(boolean freeWithSubscription) {
        this.freeWithSubscription = freeWithSubscription;
    }

    public boolean hasHeadlights() {
        return headlights;
    }

    public void setHeadlights(boolean headlights) {
        this.headlights = headlights;
    }

    public boolean hasMultipleDryTyreTypes() {
        return multipleDryTyreTypes;
    }

    public void setMultipleDryTyreTypes(boolean multipleDryTyreTypes) {
        this.multipleDryTyreTypes = multipleDryTyreTypes;
    }

    public long getHp() {
        return hp;
    }

    public void setHp(long hp) {
        this.hp = hp;
    }

    public boolean isPsPurchasable() {
        return psPurchasable;
    }

    public void setPsPurchasable(boolean psPurchasable) {
        this.psPurchasable = psPurchasable;
    }

    public double getMaxPowerAdjustPercentage() {
        return maxPowerAdjustPercentage;
    }

    public void setMaxPowerAdjustPercentage(double maxPowerAdjustPercentage) {
        this.maxPowerAdjustPercentage = maxPowerAdjustPercentage;
    }

    public double getMaxWeightPenaltyKg() {
        return maxWeightPenaltyKg;
    }

    public void setMaxWeightPenaltyKg(double maxWeightPenaltyKg) {
        this.maxWeightPenaltyKg = maxWeightPenaltyKg;
    }

    public double getMinPowerAdjustPercentage() {
        return minPowerAdjustPercentage;
    }

    public void setMinPowerAdjustPercentage(double minPowerAdjustPercentage) {
        this.minPowerAdjustPercentage = minPowerAdjustPercentage;
    }

    public long getPackageId() {
        return packageId;
    }

    public void setPackageId(long packageId) {
        this.packageId = packageId;
    }

    public long getPatterns() {
        return patterns;
    }

    public void setPatterns(long patterns) {
        this.patterns = patterns;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        this.retired = retired;
    }

    public String getSearchFilters() {
        return searchFilters;
    }

    public void setSearchFilters(String searchFilters) {
        this.searchFilters = searchFilters;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public long getSku() {
        return sku;
    }

    public void setSku(long sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "CarResponse{" +
                "aiEnabled=" + aiEnabled +
                ", allowNumberColors=" + allowNumberColors +
                ", allowSponsor1=" + allowSponsor1 +
                ", allowSponsor2=" + allowSponsor2 +
                ", allowWheelColor=" + allowWheelColor +
                ", awardExempt=" + awardExempt +
                ", carDirpath='" + carDirpath + '\'' +
                ", carId=" + carId +
                ", carName='" + carName + '\'' +
                ", carNameAbbreviated='" + carNameAbbreviated + '\'' +
                ", carTypes=" + carTypes +
                ", carWeight=" + carWeight +
                ", categories=" + categories +
                ", created=" + created +
                ", firstSale=" + firstSale +
                ", forumUrl='" + forumUrl + '\'' +
                ", freeWithSubscription=" + freeWithSubscription +
                ", headlights=" + headlights +
                ", multipleDryTyreTypes=" + multipleDryTyreTypes +
                ", hp=" + hp +
                ", psPurchasable=" + psPurchasable +
                ", maxPowerAdjustPercentage=" + maxPowerAdjustPercentage +
                ", maxWeightPenaltyKg=" + maxWeightPenaltyKg +
                ", minPowerAdjustPercentage=" + minPowerAdjustPercentage +
                ", packageId=" + packageId +
                ", patterns=" + patterns +
                ", price=" + price +
                ", priceDisplay='" + priceDisplay + '\'' +
                ", retired=" + retired +
                ", searchFilters='" + searchFilters + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", sku=" + sku +
                '}';
    }

}
