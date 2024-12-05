package Factory;

import Factory.AbstractFactory.CasualClothesFactory;
import Factory.AbstractFactory.ClothesFactory;
import Factory.AbstractFactory.Jacket;
import Factory.FactoryMethod.Factory;
import Factory.FactoryMethod.Unit;
import Factory.FactoryMethod.UnitFactory;
import Factory.FactoryMethod.UnitType;

public class Main {
    public static void main(String[] args) {
// factory method
        Factory factory = new UnitFactory();

        Unit tank = factory.createUnit(UnitType.TANK);
        Unit rifleman = factory.createUnit(UnitType.RIFLEMAN);

//abstract factory
        ClothesFactory casualClothesFactory = new CasualClothesFactory();
        Jacket jacket = casualClothesFactory.createJacket(5);
    }
}
