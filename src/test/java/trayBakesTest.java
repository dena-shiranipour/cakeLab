import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class trayBakesTest {

    public class bakeTest {

        private Traybake traybake;

        @BeforeEach
        public void setUp() {
            traybake = new Traybake("Brownie", "Chocolate", true, 4);
        }

        @Test
        public void testCutCake() {
            assertEquals("Cut the cake!", traybake.cutCake(), "Should return 'Cut the cake' for more than 3 trays");

            traybake.setNumberOfServings(2);
            assertEquals("The cake doesn't need cutting", traybake.cutCake(), "Should return 'The cake doesn't need cutting' for 2 trays");
        }

        @Test
        public void testNumberOfServings() {
            assertEquals(4, traybake.getNumberOfServings(), "Should return 4 servings ");

            traybake.setNumberOfServings(6);
            assertEquals(6, traybake.getNumberOfServings(), "Should set the number of servings to 6");
        }
    }













}
