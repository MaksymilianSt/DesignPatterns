package Factory.AbstractFactory;

public abstract class Pants {
    private String color;
    private String size;
    private String material;

    Pants(String color, String size, String material) {
        this.color = color;
        this.size = size;
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }


    public String getMaterial() {
        return material;
    }
}
