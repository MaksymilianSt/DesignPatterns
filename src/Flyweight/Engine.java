package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class Engine {
    private static final Map<String, Engine> engines = new HashMap<>();
    private final String model;

    private Engine(String model) {
        this.model = model;
    }

    static Engine getInstance(String model) {
        return engines.computeIfAbsent(model, Engine::new);
    }

    public String getModel() {
        return model;
    }
}
