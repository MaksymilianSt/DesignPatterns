package Observer;

public class ColdAlert implements Observer {
    @Override
    public void update(double temperature) {
        if (temperature < 5) {
            System.out.println(this.getClass().getSimpleName() + ":\n\t" + "It's cold: " + temperature);
        }
    }
}
