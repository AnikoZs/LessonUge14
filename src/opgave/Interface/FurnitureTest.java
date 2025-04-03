package opgave.Interface;

public class FurnitureTest {
    public static void main(String[] args) {
        // Opret møbler
        Furniture chair = new Chair("Wood", 499.99);
        Furniture sofa = new Sofa("Leather", 999.99);
        Furniture table = new Table("Glass", 350.00);

        // Udskriv materiale og pris for hvert møbel
        System.out.println("Stol Materiale: " + chair.getMaterial() + ", Pris: " + chair.getPrice());
        System.out.println("Sofa Materiale: " + sofa.getMaterial() + ", Pris: " + sofa.getPrice());
        System.out.println("Bord Materiale: " + table.getMaterial() + ", Pris: " + table.getPrice());
    }
}
