package me.hfox.iracing.data.api.data.member;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class MemberResponse {

    @JsonProperty(required = true)
    private boolean success;

    @JsonProperty(value = "cust_ids", required = true)
    private List<Long> custIds;

    @JsonProperty(required = true)
    private List<MemberEntryResponse> members;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public List<Long> getCustIds() {
        return custIds;
    }

    public void setCustIds(List<Long> custIds) {
        this.custIds = custIds;
    }

    public List<MemberEntryResponse> getMembers() {
        return members;
    }

    public void setMembers(List<MemberEntryResponse> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MemberResponse{" +
                "success=" + success +
                ", custIds=" + custIds +
                ", members=" + members +
                '}';
    }

}
