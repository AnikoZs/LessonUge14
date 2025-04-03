package opgave.UnitTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


import java.util.ArrayList;

public class ShoppingListTest {

    @Test
    public void testCalculateTotal() {
        // Arrange: Opret en indkøbsliste med tre varer
        ArrayList<Double> itemPrices = new ArrayList<>();
        itemPrices.add(100.0);
        itemPrices.add(200.0);
        itemPrices.add(300.0);
        ShoppingList shoppingList = new ShoppingList(itemPrices);

        // Act: Beregn totalen
        double total = shoppingList.calculateTotal();

        // Assert: Kontroller, at den samlede pris er korrekt
        assertEquals(600.0, total, "Totalen burde være 600.0");
    }

    @Test
    public void testCalculateTotalEmptyList() {
        // Arrange: Opret en indkøbsliste uden varer (tom ArrayList)
        ArrayList<Double> itemPrices = new ArrayList<>();
        ShoppingList shoppingList = new ShoppingList(itemPrices);

        // Act: Beregn totalen
        double total = shoppingList.calculateTotal();

        // Assert: Den samlede pris burde være 0 for en tom indkøbsliste
        assertEquals(0.0, total, "Totalen burde være 0.0 for en tom indkøbsliste");
    }

    @Test
    public void testAddItem() {
        // Arrange: Opret en indkøbsliste og tilføj én vare
        ArrayList<Double> itemPrices = new ArrayList<>();
        ShoppingList shoppingList = new ShoppingList(itemPrices);

        // Act: Tilføj en vare
        shoppingList.addItem(150.0);
        double total = shoppingList.calculateTotal();

        // Assert: Totalen skal være 150.0 for én vare
        assertEquals(150.0, total, "Totalen burde være 150.0 efter at have tilføjet én vare");
    }

    @Test
    public void testRemoveItem() {
        // Arrange: Opret en indkøbsliste med tre varer
        ArrayList<Double> itemPrices = new ArrayList<>();
        itemPrices.add(100.0);
        itemPrices.add(200.0);
        itemPrices.add(300.0);
        ShoppingList shoppingList = new ShoppingList(itemPrices);

        // Act: Fjern én vare
        shoppingList.removeItem(200.0);
        double total = shoppingList.calculateTotal();

        // Assert: Den samlede pris burde nu være 400.0
        assertEquals(400.0, total, "Totalen burde være 400.0 efter at have fjernet én vare");
    }
}
