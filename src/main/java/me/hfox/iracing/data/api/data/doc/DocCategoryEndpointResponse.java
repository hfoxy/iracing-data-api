package me.hfox.iracing.data.api.data.doc;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import java.util.List;
import java.util.Map;

@JsonDeserialize
public class DocCategoryEndpointResponse {

    private String link;
    private List<String> note;
    private int expirationSeconds;
    private Map<String, DocCategoryEndpointParameterResponse> parameters;

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public List<String> getNote() {
        return note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }

    public int getExpirationSeconds() {
        return expirationSeconds;
    }

    public void setExpirationSeconds(int expirationSeconds) {
        this.expirationSeconds = expirationSeconds;
    }

    public Map<String, DocCategoryEndpointParameterResponse> getParameters() {
        return parameters;
    }

    public void setParameters(Map<String, DocCategoryEndpointParameterResponse> parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "DocCategoryEndpointResponse{" +
                "link='" + link + '\'' +
                ", note='" + note + '\'' +
                ", expirationSeconds=" + expirationSeconds +
                ", parameters=" + parameters +
                '}';
    }

}
