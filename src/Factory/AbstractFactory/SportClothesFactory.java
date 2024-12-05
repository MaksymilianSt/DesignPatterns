package Factory.AbstractFactory;

public class SportClothesFactory implements ClothesFactory {
    @Override
    public Pants createPants(Size size) {
        String pantsSize = "40";

        switch (size) {
            case S -> pantsSize = "38";
            case M -> pantsSize = "42";
            case L -> pantsSize = "45";
        }
        return new TrackPants("grey", pantsSize, "Polyester");
    }

    @Override
    public Jacket createJacket(int temp) {
        return temp < 5
                ? new WinterJacket("blue", "wool")
                : new WindJacket("black", "nylon");
    }

}
