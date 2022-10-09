package formula1.repo;

import formula1.domain.Nurburgring;
import formula1.domain.Spa;
import formula1.domain.Track;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TrackStore {

    private Map<String, Track> store = Map.of(
            "Nurburgring", new Nurburgring(),
            "Spa", new Spa()
    );

    public List<String> getTitles() {
        return new ArrayList<>(store.keySet());
    };

    public Track lookup(String trackName) {
        for (String key : store.keySet()) {
            if (key.equalsIgnoreCase(trackName)) {
                return store.get(key);
            }
        }
        throw new IllegalArgumentException("Track not found for given name: " + trackName);
    }
}
