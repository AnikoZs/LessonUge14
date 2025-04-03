package demo.UnitTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LommeregnerTest {

    @Test
    void testAdd() {
        Lommeregner l = new Lommeregner();
        assertEquals(5, l.add(2, 3));
        assertEquals(0, l.add(-1, 1));
        assertEquals(-5, l.add(-2, -3));
    }

    @Test
    void testSubtract() {
        Lommeregner l = new Lommeregner();
        assertEquals(1, l.subtract(4, 3));
        assertEquals(-2, l.subtract(3, 5));
        assertEquals(0, l.subtract(2, 2));
    }
}
