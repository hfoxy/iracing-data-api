package me.hfox.iracing.data.api.service.member;

import me.hfox.iracing.data.api.data.member.MemberEntryResponse;

import java.util.Map;
import java.util.Set;

public interface MemberService {

    Map<Long, MemberEntryResponse> getMembers(Set<Long> customerIds, boolean licenses);

    default Map<Long, MemberEntryResponse> getMembers(Set<Long> customerIds) {
        return getMembers(customerIds, false);
    }

    MemberEntryResponse getMember(Long customerId, boolean licenses);

    default MemberEntryResponse getMember(Long customerId) {
        return getMember(customerId, false);
    }

}
