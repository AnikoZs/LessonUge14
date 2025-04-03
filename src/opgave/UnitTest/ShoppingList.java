package opgave.UnitTest;

import java.util.ArrayList;

public class ShoppingList {
    private ArrayList<Double> itemPrices; // ArrayList til at holde varepriserne

    // Konstruktor til at initialisere indkøbslisten med en ArrayList af varepriser
    public ShoppingList(ArrayList<Double> itemPrices) {
        this.itemPrices = itemPrices;
    }

    // Metode der beregner den samlede pris for indkøbslisten
    public double calculateTotal() {
        double total = 0;
        for (Double price : itemPrices) {
            total += price;
        }
        return total;
    }

    // Metode til at tilføje en vare til listen
    public void addItem(double price) {
        itemPrices.add(price);
    }

    // Metode til at fjerne en vare fra listen
    public void removeItem(double price) {
        itemPrices.remove(price);
    }
}
