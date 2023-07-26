package me.hfox.iracing.data.api.data.member;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import me.hfox.iracing.data.api.data.team.TeamDriverLicenseResponse;
import me.hfox.iracing.data.api.data.team.TeamHelmetResponse;
import me.hfox.iracing.data.api.util.Constants;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;

public class MemberEntryResponse {

    @JsonProperty("cust_id")
    private long custId;

    @JsonProperty("display_name")
    private String displayName;
    private MemberHelmetResponse helmet;

    @JsonProperty("last_login")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_PATTERN, timezone = "UTC")
    private ZonedDateTime lastLogin;

    private ZonedDateTime memberSince;

    @JsonProperty("club_id")
    private long clubId;

    @JsonProperty("club_name")
    private String clubName;
    private boolean ai;

    private List<MemberLicenseResponse> licences;

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

    public MemberHelmetResponse getHelmet() {
        return helmet;
    }

    public void setHelmet(MemberHelmetResponse helmet) {
        this.helmet = helmet;
    }

    public ZonedDateTime getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(ZonedDateTime lastLogin) {
        this.lastLogin = lastLogin;
    }

    @JsonProperty("member_since")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_DATE_PATTERN, timezone = "UTC")
    public LocalDate _getMemberSince() {
        return memberSince.toLocalDate();
    }

    @JsonProperty("member_since")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern= Constants.ISO_8601_DATE_PATTERN, timezone = "UTC")
    public void _setMemberSince(LocalDate memberSince) {
        this.memberSince = ZonedDateTime.of(memberSince, LocalTime.MIN, ZoneOffset.UTC);
    }

    @JsonIgnore
    public ZonedDateTime getMemberSince() {
        return memberSince;
    }

    @JsonIgnore
    public void setMemberSince(ZonedDateTime memberSince) {
        this.memberSince = memberSince;
    }

    public long getClubId() {
        return clubId;
    }

    public void setClubId(long clubId) {
        this.clubId = clubId;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public boolean isAi() {
        return ai;
    }

    public void setAi(boolean ai) {
        this.ai = ai;
    }

    public List<MemberLicenseResponse> getLicences() {
        return licences;
    }

    public void setLicences(List<MemberLicenseResponse> licences) {
        this.licences = licences;
    }

    @Override
    public String toString() {
        return "MemberEntryResponse{" +
                "custId=" + custId +
                ", displayName='" + displayName + '\'' +
                ", helmet=" + helmet +
                ", lastLogin=" + lastLogin +
                ", memberSince=" + memberSince +
                ", clubId=" + clubId +
                ", clubName='" + clubName + '\'' +
                ", ai=" + ai +
                ", licences=" + licences +
                '}';
    }

}
