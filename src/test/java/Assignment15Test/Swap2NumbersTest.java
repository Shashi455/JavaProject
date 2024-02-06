package Assignment15Test;

import Assignment15.Swap2Numbers;
import org.junit.Test;
import static org.junit.Assert.*;

public class Swap2NumbersTest {

    public void testSwapWithoutTemp() {
        int a = 5;
        int b = 10;

        // Perform the swap without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        // Check if the values are swapped correctly
        assertEquals(10, a);
        assertEquals(5, b);
    }
}



