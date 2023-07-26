package me.hfox.iracing.data.api.data.team;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.ZonedDateTime;
import java.util.List;

public class TeamResponse {

    @JsonProperty("team_id")
    private long teamId;

    @JsonProperty("owner_id")
    private long ownerId;

    @JsonProperty("team_name")
    private String teamName;
    private ZonedDateTime created;
    private boolean hidden;
    private String about;
    private String url;

    @JsonProperty("roster_count")
    private int rosterCount;
    private boolean recruiting;

    @JsonProperty("private_wall")
    private boolean privateWall;

    @JsonProperty("is_default")
    private boolean _default;

    @JsonProperty("is_owner")
    private boolean _owner;

    @JsonProperty("is_admin")
    private boolean admin;
    private TeamSuitResponse suit;
    private TeamDriverResponse owner;
    private TeamTagsResponse tags;
    // team_applications
    // pending_requests
    private boolean member;
    private boolean applicant;
    private boolean invite;
    private boolean ignored;
    private List<TeamDriverResponse> roster;

    public long getTeamId() {
        return teamId;
    }

    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRosterCount() {
        return rosterCount;
    }

    public void setRosterCount(int rosterCount) {
        this.rosterCount = rosterCount;
    }

    public boolean isRecruiting() {
        return recruiting;
    }

    public void setRecruiting(boolean recruiting) {
        this.recruiting = recruiting;
    }

    public boolean isPrivateWall() {
        return privateWall;
    }

    public void setPrivateWall(boolean privateWall) {
        this.privateWall = privateWall;
    }

    public boolean isDefault() {
        return _default;
    }

    public void setDefault(boolean _default) {
        this._default = _default;
    }

    public boolean isOwner() {
        return _owner;
    }

    public void setOwner(boolean _owner) {
        this._owner = _owner;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public TeamSuitResponse getSuit() {
        return suit;
    }

    public void setSuit(TeamSuitResponse suit) {
        this.suit = suit;
    }

    public TeamDriverResponse getOwner() {
        return owner;
    }

    public void setOwner(TeamDriverResponse owner) {
        this.owner = owner;
    }

    public TeamTagsResponse getTags() {
        return tags;
    }

    public void setTags(TeamTagsResponse tags) {
        this.tags = tags;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public boolean isApplicant() {
        return applicant;
    }

    public void setApplicant(boolean applicant) {
        this.applicant = applicant;
    }

    public boolean isInvite() {
        return invite;
    }

    public void setInvite(boolean invite) {
        this.invite = invite;
    }

    public boolean isIgnored() {
        return ignored;
    }

    public void setIgnored(boolean ignored) {
        this.ignored = ignored;
    }

    public List<TeamDriverResponse> getRoster() {
        return roster;
    }

    public void setRoster(List<TeamDriverResponse> roster) {
        this.roster = roster;
    }

}
