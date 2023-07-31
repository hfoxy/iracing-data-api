package me.hfox.iracing.data.api.data.track;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import me.hfox.iracing.data.api.util.Constants;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TrackResponse {

    private boolean aiEnabled;
    private boolean allowPitlaneCollisions;
    private boolean allowRollingStart;
    private boolean allowStandingStart;
    private boolean awardExempt;
    private String category;
    private Integer categoryId;
    private String closes;
    private String configName;
    private Integer cornersPerLap;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime created;

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime firstSale;

    private boolean freeWithSubscription;
    private boolean fullyLit;
    private Integer gridStalls;

    @JsonProperty("has_opt_path")
    private boolean optPath;

    @JsonProperty("has_short_parade_lap")
    private boolean shortParadeLap;

    @JsonProperty("has_start_zone")
    private boolean startZone;

    @JsonProperty("has_svg_map")
    private boolean svgMap;

    @JsonProperty("is_dirt")
    private boolean dirt;

    @JsonProperty("is_oval")
    private boolean oval;

    @JsonProperty("is_ps_purchasable")
    private boolean psPurchasable;

    private Integer lapScoring;
    private Double latitude;
    private String location;
    private Double longitude;
    private Integer maxCars;
    private boolean nightLighting;
    private Double nominalLapTime;
    private Integer numberPitstalls;

    @JsonIgnore
    private ZonedDateTime opens;

    private Integer packageId;
    private Integer pitRoadSpeedLimit;
    private Double price;
    private String priceDisplay;
    private Integer priority;
    private boolean purchasable;
    private Integer qualifyLaps;
    private boolean restartOnLeft;
    private boolean retired;
    private String searchFilters;
    private String siteUrl;
    private Integer sku;
    private Integer soloLaps;
    private boolean supportsGripCompound;
    private boolean techTrack;
    private String timeZone;
    private Double trackConfigLength;
    private String trackDirtpath;
    private Integer trackId;
    private String trackName;
    private List<TrackTypeResponse> trackTypes;

    public boolean isAiEnabled() {
        return aiEnabled;
    }

    public void setAiEnabled(boolean aiEnabled) {
        this.aiEnabled = aiEnabled;
    }

    public boolean isAllowPitlaneCollisions() {
        return allowPitlaneCollisions;
    }

    public void setAllowPitlaneCollisions(boolean allowPitlaneCollisions) {
        this.allowPitlaneCollisions = allowPitlaneCollisions;
    }

    public boolean isAllowRollingStart() {
        return allowRollingStart;
    }

    public void setAllowRollingStart(boolean allowRollingStart) {
        this.allowRollingStart = allowRollingStart;
    }

    public boolean isAllowStandingStart() {
        return allowStandingStart;
    }

    public void setAllowStandingStart(boolean allowStandingStart) {
        this.allowStandingStart = allowStandingStart;
    }

    public boolean isAwardExempt() {
        return awardExempt;
    }

    public void setAwardExempt(boolean awardExempt) {
        this.awardExempt = awardExempt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCloses() {
        return closes;
    }

    public void setCloses(String closes) {
        this.closes = closes;
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName;
    }

    public Integer getCornersPerLap() {
        return cornersPerLap;
    }

    public void setCornersPerLap(Integer cornersPerLap) {
        this.cornersPerLap = cornersPerLap;
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

    public boolean isFreeWithSubscription() {
        return freeWithSubscription;
    }

    public void setFreeWithSubscription(boolean freeWithSubscription) {
        this.freeWithSubscription = freeWithSubscription;
    }

    public boolean isFullyLit() {
        return fullyLit;
    }

    public void setFullyLit(boolean fullyLit) {
        this.fullyLit = fullyLit;
    }

    public Integer getGridStalls() {
        return gridStalls;
    }

    public void setGridStalls(Integer gridStalls) {
        this.gridStalls = gridStalls;
    }

    public boolean isOptPath() {
        return optPath;
    }

    public void setOptPath(boolean optPath) {
        this.optPath = optPath;
    }

    public boolean isShortParadeLap() {
        return shortParadeLap;
    }

    public void setShortParadeLap(boolean shortParadeLap) {
        this.shortParadeLap = shortParadeLap;
    }

    public boolean isStartZone() {
        return startZone;
    }

    public void setStartZone(boolean startZone) {
        this.startZone = startZone;
    }

    public boolean isSvgMap() {
        return svgMap;
    }

    public void setSvgMap(boolean svgMap) {
        this.svgMap = svgMap;
    }

    public boolean isDirt() {
        return dirt;
    }

    public void setDirt(boolean dirt) {
        this.dirt = dirt;
    }

    public boolean isOval() {
        return oval;
    }

    public void setOval(boolean oval) {
        this.oval = oval;
    }

    public boolean isPsPurchasable() {
        return psPurchasable;
    }

    public void setPsPurchasable(boolean psPurchasable) {
        this.psPurchasable = psPurchasable;
    }

    public Integer getLapScoring() {
        return lapScoring;
    }

    public void setLapScoring(Integer lapScoring) {
        this.lapScoring = lapScoring;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getMaxCars() {
        return maxCars;
    }

    public void setMaxCars(Integer maxCars) {
        this.maxCars = maxCars;
    }

    public boolean isNightLighting() {
        return nightLighting;
    }

    public void setNightLighting(boolean nightLighting) {
        this.nightLighting = nightLighting;
    }

    public Double getNominalLapTime() {
        return nominalLapTime;
    }

    public void setNominalLapTime(Double nominalLapTime) {
        this.nominalLapTime = nominalLapTime;
    }

    public Integer getNumberPitstalls() {
        return numberPitstalls;
    }

    public void setNumberPitstalls(Integer numberPitstalls) {
        this.numberPitstalls = numberPitstalls;
    }

    @JsonProperty("opens")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_DATE_PATTERN, timezone = "UTC")
    public LocalDate _getOpens() {
        return opens.toLocalDate();
    }

    @JsonProperty("opens")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_DATE_PATTERN, timezone = "UTC")
    public void _setOpens(LocalDate memberSince) {
        this.opens = ZonedDateTime.of(memberSince, LocalTime.MIN, ZoneOffset.UTC);
    }

    public ZonedDateTime getOpens() {
        return opens;
    }

    public void setOpens(ZonedDateTime opens) {
        this.opens = opens;
    }

    public Integer getPackageId() {
        return packageId;
    }

    public void setPackageId(Integer packageId) {
        this.packageId = packageId;
    }

    public Integer getPitRoadSpeedLimit() {
        return pitRoadSpeedLimit;
    }

    public void setPitRoadSpeedLimit(Integer pitRoadSpeedLimit) {
        this.pitRoadSpeedLimit = pitRoadSpeedLimit;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPriceDisplay() {
        return priceDisplay;
    }

    public void setPriceDisplay(String priceDisplay) {
        this.priceDisplay = priceDisplay;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public boolean isPurchasable() {
        return purchasable;
    }

    public void setPurchasable(boolean purchasable) {
        this.purchasable = purchasable;
    }

    public Integer getQualifyLaps() {
        return qualifyLaps;
    }

    public void setQualifyLaps(Integer qualifyLaps) {
        this.qualifyLaps = qualifyLaps;
    }

    public boolean isRestartOnLeft() {
        return restartOnLeft;
    }

    public void setRestartOnLeft(boolean restartOnLeft) {
        this.restartOnLeft = restartOnLeft;
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

    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }

    public Integer getSoloLaps() {
        return soloLaps;
    }

    public void setSoloLaps(Integer soloLaps) {
        this.soloLaps = soloLaps;
    }

    public boolean isSupportsGripCompound() {
        return supportsGripCompound;
    }

    public void setSupportsGripCompound(boolean supportsGripCompound) {
        this.supportsGripCompound = supportsGripCompound;
    }

    public boolean isTechTrack() {
        return techTrack;
    }

    public void setTechTrack(boolean techTrack) {
        this.techTrack = techTrack;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public Double getTrackConfigLength() {
        return trackConfigLength;
    }

    public void setTrackConfigLength(Double trackConfigLength) {
        this.trackConfigLength = trackConfigLength;
    }

    public String getTrackDirtpath() {
        return trackDirtpath;
    }

    public void setTrackDirtpath(String trackDirtpath) {
        this.trackDirtpath = trackDirtpath;
    }

    public Integer getTrackId() {
        return trackId;
    }

    public void setTrackId(Integer trackId) {
        this.trackId = trackId;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public List<TrackTypeResponse> getTrackTypes() {
        return trackTypes;
    }

    public void setTrackTypes(List<TrackTypeResponse> trackTypes) {
        this.trackTypes = trackTypes;
    }

    @Override
    public String toString() {
        return "TrackResponse{" +
                "aiEnabled=" + aiEnabled +
                ", allowPitlaneCollisions=" + allowPitlaneCollisions +
                ", allowRollingStart=" + allowRollingStart +
                ", allowStandingStart=" + allowStandingStart +
                ", awardExempt=" + awardExempt +
                ", category='" + category + '\'' +
                ", categoryId=" + categoryId +
                ", closes='" + closes + '\'' +
                ", configName='" + configName + '\'' +
                ", cornersPerLap=" + cornersPerLap +
                ", created=" + created +
                ", firstSale=" + firstSale +
                ", freeWithSubscription=" + freeWithSubscription +
                ", fullyLit=" + fullyLit +
                ", gridStalls=" + gridStalls +
                ", optPath=" + optPath +
                ", shortParadeLap=" + shortParadeLap +
                ", startZone=" + startZone +
                ", svgMap=" + svgMap +
                ", dirt=" + dirt +
                ", oval=" + oval +
                ", psPurchasable=" + psPurchasable +
                ", lapScoring=" + lapScoring +
                ", latitude=" + latitude +
                ", location='" + location + '\'' +
                ", longitude=" + longitude +
                ", maxCars=" + maxCars +
                ", nightLighting=" + nightLighting +
                ", nominalLapTime=" + nominalLapTime +
                ", numberPitstalls=" + numberPitstalls +
                ", opens=" + opens +
                ", packageId=" + packageId +
                ", pitRoadSpeedLimit=" + pitRoadSpeedLimit +
                ", price=" + price +
                ", priceDisplay='" + priceDisplay + '\'' +
                ", priority=" + priority +
                ", purchasable=" + purchasable +
                ", qualifyLaps=" + qualifyLaps +
                ", restartOnLeft=" + restartOnLeft +
                ", retired=" + retired +
                ", searchFilters='" + searchFilters + '\'' +
                ", siteUrl='" + siteUrl + '\'' +
                ", sku=" + sku +
                ", soloLaps=" + soloLaps +
                ", supportsGripCompound=" + supportsGripCompound +
                ", techTrack=" + techTrack +
                ", timeZone='" + timeZone + '\'' +
                ", trackConfigLength=" + trackConfigLength +
                ", trackDirtpath='" + trackDirtpath + '\'' +
                ", trackId=" + trackId +
                ", trackName='" + trackName + '\'' +
                ", trackTypes=" + trackTypes +
                '}';
    }

}
