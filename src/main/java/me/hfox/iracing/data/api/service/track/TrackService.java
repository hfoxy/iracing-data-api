package me.hfox.iracing.data.api.service.track;

import me.hfox.iracing.data.api.data.track.TrackAssetsResponse;
import me.hfox.iracing.data.api.data.track.TrackResponse;

import java.util.List;

public interface TrackService {

    List<TrackResponse> getTracks();

    TrackAssetsResponse getTrackAssets();

}
