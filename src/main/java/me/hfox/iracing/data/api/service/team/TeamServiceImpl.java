package me.hfox.iracing.data.api.service.team;

import me.hfox.iracing.data.api.data.RedirectLinkResponse;
import me.hfox.iracing.data.api.data.team.TeamResponse;
import me.hfox.iracing.data.api.exception.IRacingDataException;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class TeamServiceImpl implements TeamService {

    private final AuthService authService;

    public TeamServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public TeamResponse getTeam(long teamId, boolean licenses) {
        Map<String, Object> queryParams = new HashMap<>();
        queryParams.put("team_id", teamId);
        queryParams.put("include_licenses", licenses);
        ResponseEntity<List<TeamResponse>> response = authService.getRedirectResponse(
                "/data/team/get", queryParams
        ).toEntityList(TeamResponse.class).block();

        TeamResponse team = Objects.requireNonNull(Objects.requireNonNull(response).getBody()).stream().findFirst()
                .orElseThrow(() -> new IRacingDataException("unknown team"));

        team.setTeamId(Math.abs(team.getTeamId()));
        return team;
    }

}
