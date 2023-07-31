package me.hfox.iracing.data.api.data.track;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class TrackAssetsResponseEntry {

    private String coordinates;

    @JsonProperty("detail_copy")
    private String detailCopy;

    @JsonProperty("detail_techspecs_copy")
    private String detailTechSpecsCopy;

    @JsonProperty("detail_video")
    private String detailVideo;

    private String folder;

    @JsonProperty("gallery_images")
    private String galleryImages;

    @JsonProperty("gallery_prefix")
    private String galleryPrefix;

    @JsonProperty("large_image")
    private String largeImage;
    private String logo;
    private String north;

    @JsonProperty("num_images")
    private Integer numImages;

    @JsonProperty("small_image")
    private String smallImage;

    @JsonProperty("track_id")
    private Long trackId;

    @JsonProperty("track_map")
    private String trackMap;

    @JsonProperty("track_map_layers")
    private Map<String, String> trackMapLayers;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public String getDetailCopy() {
        return detailCopy;
    }

    public void setDetailCopy(String detailCopy) {
        this.detailCopy = detailCopy;
    }

    public String getDetailTechSpecsCopy() {
        return detailTechSpecsCopy;
    }

    public void setDetailTechSpecsCopy(String detailTechSpecsCopy) {
        this.detailTechSpecsCopy = detailTechSpecsCopy;
    }

    public String getDetailVideo() {
        return detailVideo;
    }

    public void setDetailVideo(String detailVideo) {
        this.detailVideo = detailVideo;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getGalleryImages() {
        return galleryImages;
    }

    public void setGalleryImages(String galleryImages) {
        this.galleryImages = galleryImages;
    }

    public String getGalleryPrefix() {
        return galleryPrefix;
    }

    public void setGalleryPrefix(String galleryPrefix) {
        this.galleryPrefix = galleryPrefix;
    }

    public String getLargeImage() {
        return largeImage;
    }

    public void setLargeImage(String largeImage) {
        this.largeImage = largeImage;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNorth() {
        return north;
    }

    public void setNorth(String north) {
        this.north = north;
    }

    public Integer getNumImages() {
        return numImages;
    }

    public void setNumImages(Integer numImages) {
        this.numImages = numImages;
    }

    public String getSmallImage() {
        return smallImage;
    }

    public void setSmallImage(String smallImage) {
        this.smallImage = smallImage;
    }

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public String getTrackMap() {
        return trackMap;
    }

    public void setTrackMap(String trackMap) {
        this.trackMap = trackMap;
    }

    public Map<String, String> getTrackMapLayers() {
        return trackMapLayers;
    }

    public void setTrackMapLayers(Map<String, String> trackMapLayers) {
        this.trackMapLayers = trackMapLayers;
    }

    @Override
    public String toString() {
        return "TrackAssetsResponseEntry{" +
                "coordinates='" + coordinates + '\'' +
                ", detailCopy='" + detailCopy + '\'' +
                ", detailTechSpecsCopy='" + detailTechSpecsCopy + '\'' +
                ", detailVideo='" + detailVideo + '\'' +
                ", folder='" + folder + '\'' +
                ", galleryImages='" + galleryImages + '\'' +
                ", galleryPrefix='" + galleryPrefix + '\'' +
                ", largeImage='" + largeImage + '\'' +
                ", logo='" + logo + '\'' +
                ", north='" + north + '\'' +
                ", numImages=" + numImages +
                ", smallImage='" + smallImage + '\'' +
                ", trackId=" + trackId +
                ", trackMap='" + trackMap + '\'' +
                ", trackMapLayers=" + trackMapLayers +
                '}';
    }
}
