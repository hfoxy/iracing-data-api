package me.hfox.iracing.data.api.service;

import me.hfox.iracing.data.api.exception.IRacingAuthenticationException;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.stereotype.Service;

@Service
public class TestAuthService {

    private final AuthService authService;

    public TestAuthService(AuthService authService) {
        this.authService = authService;
    }

    public void login() {
        if (authService.isAuthenticated()) return;

        String email = System.getenv("IRACING_EMAIL");
        String password = System.getenv("IRACING_PASSWORD");
        if (email == null || password == null) {
            throw new IRacingAuthenticationException("invalid credentials, check IRACING_EMAIL and IRACING_PASSWORD");
        }

        authService.login(email, password);
    }

}
