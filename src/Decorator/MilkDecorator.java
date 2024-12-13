package Decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", with milk";
    }

    @Override
    public double getPrice() {
        return decoratedCoffee.getPrice() + 2;
    }
}
