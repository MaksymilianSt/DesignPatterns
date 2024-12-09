package Flyweight;

public class Main {
    public static void main(String[] args) {
        Car Porche = new Car("Porsche", "Black", 1400, Engine.getInstance("V8"));
        Car Bmw = new Car("BMW", "Yellow", 1800, Engine.getInstance("V8"));

        System.out.println(Porche.getEngine() == Bmw.getEngine());
    }
}
