import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class cupcakeTest {


    public class CupcakeTest {

        private Cupcake cupcake;

        @BeforeEach
        public void setUp() {
            cupcake = new Cupcake("Vanilla Cupcake", "Vanilla", true, 5);
        }

        @Test
        public void testLightCandles() {
            cupcake.lightCandles();
            assertEquals(5, cupcake.getNoOfCandles(), "Candles should still be 5 after lighting");
        }

        @Test
        public void testGetNoOfCandles() {
            assertEquals(5, cupcake.getNoOfCandles(), "Should return 5 candles");
        }

        @Test
        public void testSetNoOfCandles() {
            cupcake.setNoOfCandles(3);
            assertEquals(3, cupcake.getNoOfCandles(), "Should set the number of candles to 3");
        }
    }

}
