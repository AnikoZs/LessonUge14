package opgave.Interface;

public class Table implements Furniture {
    private String material;
    private double price;

    public Table(String material, double price) {
        this.material = material;
        this.price = price;
    }

    @Override
    public String getMaterial() {
        return material; // Returner materialet af bordet
    }

    @Override
    public double getPrice() {
        return price; // Returner prisen af bordet
    }
}
