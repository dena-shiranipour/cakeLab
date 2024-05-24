import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CakesTest {

    private Cakes healthyCake;
    private Cakes unhealthyCake;

    @BeforeEach
    public void setUp() {
        healthyCake = new Cakes("Honey Cake", Cakes.HONEY_FLAVOUR, true);
        unhealthyCake = new Cakes("Chocolate Cake", Cakes.CHOCOLATE_FLAVOUR, false);
    }

    @Test
    public void testIsHealthy() {
        assertTrue(healthyCake.isHealthy(), "This cake is healthy");
    }

    @Test
    public void testIsNotHealthy() {
        assertFalse(unhealthyCake.isHealthy(), "This cake is unhealthy");
    }

    @Test
    public void testGetBaseFlavour() {
        assertEquals(Cakes.HONEY_FLAVOUR, healthyCake.getBaseFlavour(), "Base flavour should be Honey for healthy cake");
        assertEquals(Cakes.CHOCOLATE_FLAVOUR, unhealthyCake.getBaseFlavour(), "Base flavour should be Chocolate for unhealthy cake");
    }
}
