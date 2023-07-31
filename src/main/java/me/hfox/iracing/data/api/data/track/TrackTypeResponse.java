package me.hfox.iracing.data.api.data.track;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TrackTypeResponse {

    private String trackType;

    public String getTrackType() {
        return trackType;
    }

    public void setTrackType(String trackType) {
        this.trackType = trackType;
    }

    @Override
    public String toString() {
        return "TrackTypeResponse{" +
                "trackType='" + trackType + '\'' +
                '}';
    }

}
