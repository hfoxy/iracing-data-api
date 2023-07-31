package me.hfox.iracing.data.api.service.track;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.service.TestAuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class TrackServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(TrackServiceImplTest.class);

    @Autowired
    TestAuthService authService;

    @Autowired
    TrackService trackService;

    @BeforeEach
    void setUp() {
        authService.login();
    }

    @Test
    void getTracks() {
        LOGGER.info("tracks: {}", trackService.getTracks());
    }

    @Test
    void getTrackAssets() {
        LOGGER.info("track assets: {}", trackService.getTrackAssets());
    }

}