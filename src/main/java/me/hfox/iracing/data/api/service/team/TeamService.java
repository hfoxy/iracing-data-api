package me.hfox.iracing.data.api.service.team;

import me.hfox.iracing.data.api.data.team.TeamResponse;

public interface TeamService {

    TeamResponse getTeams(long teamId, boolean licenses);

    TeamResponse getTeams(long teamId);

}
