package Factory.AbstractFactory;

public interface ClothesFactory {
    Pants createPants(Size size);

    Jacket createJacket(int temp);

}
