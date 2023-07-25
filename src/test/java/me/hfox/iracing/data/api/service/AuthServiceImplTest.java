package me.hfox.iracing.data.api.service;

import me.hfox.iracing.data.api.IRacingDataApiConfiguration;
import me.hfox.iracing.data.api.exception.IRacingAuthenticationException;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = IRacingDataApiConfiguration.class)
class AuthServiceImplTest {

    @Autowired
    AuthService authService;

    @Autowired
    TestAuthService testAuthService;

    @Test
    void login() {
        authService.logout();

        testAuthService.login();
        assertTrue(authService.isAuthenticated(), "api should be authenticated");
    }

    @Test
    void loginFailure() {
        authService.logout();

        assertThrows(IRacingAuthenticationException.class, () -> authService.login("nope", "nope"), "invalid login should throw exception");
    }

}