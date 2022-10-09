package formula1.repo;

import formula1.domain.Car;
import formula1.domain.Ferrari;
import formula1.domain.Mercedes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CarStore {

    private Map<String, Car> store = Map.of(
            "Ferrari", new Ferrari(),
            "Mercedes", new Mercedes()
    );

    public List<String> getTitles() {
        return new ArrayList<>(store.keySet());
    };

    public Car lookup(String carName) {
        for (String key : store.keySet()) {
            if (key.equalsIgnoreCase(carName)) {
                return store.get(key);
            }
        }
        throw new IllegalArgumentException("Car not found for given name: " + carName);
    }
}
