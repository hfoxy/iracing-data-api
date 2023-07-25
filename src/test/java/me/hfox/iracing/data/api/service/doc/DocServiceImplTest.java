package me.hfox.iracing.data.api.service.doc;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.service.TestAuthService;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class DocServiceImplTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(DocServiceImplTest.class);

    @Autowired
    TestAuthService authService;

    @Autowired
    DocService docService;

    @BeforeEach
    void setUp() {
        authService.login();
    }

    @Test
    void getDocs() {
        LOGGER.info("docs: {}", docService.getDocs());
    }

}