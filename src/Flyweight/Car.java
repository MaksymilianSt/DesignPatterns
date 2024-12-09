package Flyweight;

public class Car {
    private String name;
    private String color;
    private int weight;
    private Engine engine;

    public Car(String name, String color, int weight, Engine engine) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.engine = engine;
    }

    public Engine getEngine() {
        return engine;
    }
}
