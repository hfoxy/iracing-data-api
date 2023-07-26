package me.hfox.iracing.data.api.data.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class TeamDriverResponse {

    @JsonProperty("cust_id")
    private long custId;

    @JsonProperty("display_name")
    private String displayName;
    private TeamHelmetResponse helmet;
    private boolean owner;
    private boolean admin;
    private List<TeamDriverLicenseResponse> licences;

    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public TeamHelmetResponse getHelmet() {
        return helmet;
    }

    public void setHelmet(TeamHelmetResponse helmet) {
        this.helmet = helmet;
    }

    public boolean isOwner() {
        return owner;
    }

    public void setOwner(boolean owner) {
        this.owner = owner;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public List<TeamDriverLicenseResponse> getLicences() {
        return licences;
    }

    public void setLicences(List<TeamDriverLicenseResponse> licences) {
        this.licences = licences;
    }

    @Override
    public String toString() {
        return "TeamDriverResponse{" +
                "custId=" + custId +
                ", displayName='" + displayName + '\'' +
                ", helmet=" + helmet +
                ", owner=" + owner +
                ", admin=" + admin +
                ", licences=" + licences +
                '}';
    }

}
