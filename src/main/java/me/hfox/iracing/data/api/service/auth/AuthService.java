package me.hfox.iracing.data.api.service.auth;

import org.springframework.web.reactive.function.client.ExchangeStrategies;
import org.springframework.web.reactive.function.client.WebClient;

public interface AuthService {

    boolean isAuthenticated();

    WebClient getAuthenticatedClient();

    WebClient getClient();

    void login(String email, String password);

    void logout();

}
