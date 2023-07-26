package me.hfox.iracing.data.api.service.team;

import me.hfox.iracing.data.api.data.team.TeamResponse;

public interface TeamService {

    TeamResponse getTeam(long teamId, boolean licenses);

    default TeamResponse getTeam(long teamId) {
        return getTeam(teamId, false);
    }

}
