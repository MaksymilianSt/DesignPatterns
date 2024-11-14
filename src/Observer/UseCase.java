package Observer;

public class UseCase {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.addObserver(new ColdAlert());
        weatherStation.addObserver(new WeatherChangeAlert());

        weatherStation.setTemperature(1);
    }
}
