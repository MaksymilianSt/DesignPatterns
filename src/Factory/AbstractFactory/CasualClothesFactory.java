package Factory.AbstractFactory;


public class CasualClothesFactory implements ClothesFactory {
    @Override
    public Pants createPants(Size size) {
        if (Size.L.equals(size)) {
            return new SuitPants("black", size.toString());
        }
        return new JeansPants("blue", size.toString());
    }

    @Override
    public Jacket createJacket(int temp) {
        return temp < 10
                ? new WinterJacket("blue", "wool")
                : new WindJacket("black", "cotton");
    }
}
