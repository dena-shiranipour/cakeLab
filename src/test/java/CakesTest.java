import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CakesTest {

    public class CakeTest {

        private Cakes healthyCake;
        private Cakes.Cake unhealthyCake;

        @BeforeEach
        public void setUp() {
            healthyCake = new Cakes.Cake("Honey", Cakes.honeyFlavour, true);
            unhealthyCake = new Cakes.Cake("Chocolate", Cakes.chocolateFlavour, false);
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
        public void testEachHealthyorNotCake() {
            if (healthyCake.isHealthy()) {
                assertEquals("Honey", healthyCake.getBaseFlavour(), "This is a healthy option");
            } else System.out.println("High cholesterol cake");
        }


        }
    }











}
