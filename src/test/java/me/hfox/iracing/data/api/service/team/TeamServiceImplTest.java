package me.hfox.iracing.data.api.service.team;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.service.TestAuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class TeamServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TeamServiceImplTest.class);

    @Autowired
    TestAuthService authService;

    @Autowired
    TeamService teamService;

    @BeforeEach
    void setUp() {
        authService.login();
    }

    @Test
    void getTeamsById() {
        LOGGER.info("teams: {}", teamService.getTeams(230337));
    }

    @Test
    void getTeamsByIdIncludeLicenses() {
        LOGGER.info("teams: {}", teamService.getTeams(230337, true));
    }

}