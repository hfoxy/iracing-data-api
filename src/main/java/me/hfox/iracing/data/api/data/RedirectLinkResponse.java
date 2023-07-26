package me.hfox.iracing.data.api.data;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.data.api.util.Constants;

import java.time.ZonedDateTime;

public class RedirectLinkResponse {

    @JsonProperty("link")
    private String link;

    @JsonProperty("expires")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime expires;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public ZonedDateTime getExpires() {
        return expires;
    }

    public void setExpires(ZonedDateTime expires) {
        this.expires = expires;
    }

    @Override
    public String toString() {
        return "RedirectLinkResponse{" +
                "link='" + link + '\'' +
                ", expires=" + expires +
                '}';
    }

}
