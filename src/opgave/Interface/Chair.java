package opgave.Interface;

public class Chair implements Furniture {
    private String material;
    private double price;

    public Chair(String material, double price) {
        this.material = material;
        this.price = price;
    }

    @Override
    public String getMaterial() {
        return material; // Returner materialet af stolen
    }

    @Override
    public double getPrice() {
        return price; // Returner prisen af stolen
    }
}
