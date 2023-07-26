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
    public TeamResponse getTeams(long teamId, boolean licenses) {
        WebClient client = authService.getAuthenticatedClient();
        Map<String, Object> uriVariables = new HashMap<>();
        uriVariables.put("team_id", teamId);
        uriVariables.put("include_licenses", licenses);
        ResponseEntity<RedirectLinkResponse> redirectResponse = client.get().uri("/data/car/get", uriVariables).retrieve()
                .toEntity(RedirectLinkResponse.class).block();

        RedirectLinkResponse redirect = Objects.requireNonNull(Objects.requireNonNull(redirectResponse).getBody());

        URI uri;
        try {
            uri = new URI(redirect.getLink());
        } catch (URISyntaxException ex) {
            throw new IRacingDataException("invalid link uri", ex);
        }

        ResponseEntity<List<TeamResponse>> response = authService.getClient().get().uri(uri).retrieve()
                .toEntityList(TeamResponse.class).block();

        TeamResponse team = Objects.requireNonNull(Objects.requireNonNull(response).getBody()).stream().findFirst()
                .orElseThrow(() -> new IRacingDataException("unknown team"));

        team.setTeamId(Math.abs(team.getTeamId()));
        return team;
    }

    @Override
    public TeamResponse getTeams(long teamId) {
        return getTeams(teamId, false);
    }

}
