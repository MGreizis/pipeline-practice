import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    @Test
    public void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testSubtraction() {
        assertEquals(0, 2 - 2);
    }

    @Test
    public void testMultiplication() {
        assertEquals(4, 2 * 2);
    }

    @Test
    public void testDivision() {
        assertEquals(1, 2 / 2);
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            int x = 2 / 0;
        });
    }
}
