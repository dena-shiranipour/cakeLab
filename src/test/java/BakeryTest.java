
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BakeryTest {
    private Bakery bakery;

    public void setUp() {
        bakery = new Bakery("Best Bakery");
    }

    @Test
    public void testBuyCake() {
        String expected = "You have bought a cake";
        String result = bakery.buyCake();
        assertEquals(expected, result);
    }

    @Test
    public void testHasStock() {
        String expected = "This cake is available";
        String result = bakery.hasStock();
        assertEquals(expected, result);


    }
}
