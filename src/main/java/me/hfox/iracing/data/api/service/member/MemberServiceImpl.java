package me.hfox.iracing.data.api.service.member;

import me.hfox.iracing.data.api.data.member.MemberEntryResponse;
import me.hfox.iracing.data.api.data.member.MemberResponse;
import me.hfox.iracing.data.api.exception.IRacingDataException;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class MemberServiceImpl implements MemberService {

    private final AuthService authService;

    public MemberServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public Map<Long, MemberEntryResponse> getMembers(Set<Long> customerIds, boolean licenses) {
        Map<Long, MemberEntryResponse> responseMap = new HashMap<>();
        if (customerIds.isEmpty()) {
            return responseMap;
        }

        String custIds = String.join(",", customerIds.stream().map(Object::toString).collect(Collectors.toSet()));
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("cust_ids", custIds);
        queryParams.put("include_licenses", licenses);

        ResponseEntity<MemberResponse> response = authService.getRedirectResponse(
                "/data/member/get", queryParams
        ).toEntity(MemberResponse.class).block();

        MemberResponse body = Objects.requireNonNull(Objects.requireNonNull(response).getBody());
        if (!body.isSuccess()) {
            throw new IRacingDataException("unsuccessful get of members");
        }

        for (MemberEntryResponse entry : body.getMembers()) {
            responseMap.put(entry.getCustId(), entry);
        }

        Set<Long> missing = new HashSet<>();
        for (Long custId : customerIds) {
            if (!responseMap.containsKey(custId)) {
                missing.add(custId);
            }
        }

        if (!missing.isEmpty()) {
            String missingCustIds = String.join(
                    ", ", missing.stream().map(Object::toString).collect(Collectors.toSet())
            );

            throw new IRacingDataException("customer ids missing from response: " + missingCustIds);
        }

        return responseMap;
    }

    @Override
    public MemberEntryResponse getMember(Long customerId, boolean licenses) {
        return getMembers(Set.of(customerId), licenses).get(customerId);
    }

}
