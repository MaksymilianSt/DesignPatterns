package Decorator;

public class SimpleCoffee implements Coffee {
    private String description;
    private double price;

    public SimpleCoffee(String description, double price) {
        this.description = description;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
