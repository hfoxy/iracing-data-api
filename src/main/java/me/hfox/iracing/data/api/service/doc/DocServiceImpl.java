package me.hfox.iracing.data.api.service.doc;

import me.hfox.iracing.data.api.data.doc.DocResponse;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Objects;

@Service
public class DocServiceImpl implements DocService {

    private final AuthService authService;

    public DocServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public DocResponse getDocs() {
        WebClient client = authService.getAuthenticatedClient();
        ResponseEntity<DocResponse> response = client.get().uri("/data/doc").retrieve()
                .toEntity(DocResponse.class).block();

        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

}
