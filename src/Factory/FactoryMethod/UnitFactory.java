package Factory.FactoryMethod;

public class UnitFactory extends Factory {

    @Override
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case TANK -> {
                return new Tank(300, 0, 50);
            }
            case RIFLEMAN -> {
                return new Rifleman(100, 0, 15);
            }
            default -> throw new IllegalArgumentException("Invalid unit type");
        }
    }
}
