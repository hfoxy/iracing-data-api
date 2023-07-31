package me.hfox.iracing.data.api.service.track;

import me.hfox.iracing.data.api.data.track.TrackAssetsResponse;
import me.hfox.iracing.data.api.data.track.TrackResponse;
import me.hfox.iracing.data.api.service.auth.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class TrackServiceImpl implements TrackService {

    private final AuthService authService;

    public TrackServiceImpl(AuthService authService) {
        this.authService = authService;
    }

    @Override
    public List<TrackResponse> getTracks() {
        ResponseEntity<List<TrackResponse>> response = authService.getRedirectResponse(
                "/data/track/get"
        ).toEntityList(TrackResponse.class).block();
        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

    @Override
    public TrackAssetsResponse getTrackAssets() {
        ResponseEntity<TrackAssetsResponse> response = authService.getRedirectResponse(
                "/data/track/assets"
        ).toEntity(TrackAssetsResponse.class).block();
        return Objects.requireNonNull(Objects.requireNonNull(response).getBody());
    }

}
