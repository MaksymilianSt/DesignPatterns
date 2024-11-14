package Observer;

public class WeatherChangeAlert implements Observer {
    @Override
    public void update(double temperature) {
        System.out.println(this.getClass().getSimpleName() + ":\n\t" + "It's: " + temperature);
    }
}
