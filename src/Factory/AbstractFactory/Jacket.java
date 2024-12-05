package Factory.AbstractFactory;

public abstract class Jacket {
    private String model;
    private String color;
    private String material;

    Jacket(String model, String color, String material) {
        this.model = model;
        this.color = color;
        this.material = material;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }
}
