package opgave.Interface;

public class Sofa implements Furniture {
    private String material;
    private double price;

    public Sofa(String material, double price) {
        this.material = material;
        this.price = price;
    }

    @Override
    public String getMaterial() {
        return material; // Returner materialet af sofaen
    }

    @Override
    public double getPrice() {
        return price; // Returner prisen af sofaen
    }
}
