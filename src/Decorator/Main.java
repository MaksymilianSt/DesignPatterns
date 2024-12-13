package Decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SugarDecorator(
                new MilkDecorator(
                        new SimpleCoffee("cafe Lungo", 5)
                )
        );

        System.out.println("desc: " + coffee.getDescription() + ", price: " + coffee.getPrice());
    }
}
