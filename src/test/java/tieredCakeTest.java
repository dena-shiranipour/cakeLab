import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tieredCakeTest {

        private TieredCake tieredCake;

        @BeforeEach
        public void setUp() {
            tieredCake = new TieredCake("Wedding Cake", "Vanilla", true, 3);
        }

        @Test
        public void testPartyMessage() {
            assertEquals("So many candles", tieredCake.partyMessage(), "Should return 'So many candles' for a cake with 3 tiers");

            tieredCake.setNumberOfTiers(1);
            assertEquals("Happy Birthday ", tieredCake.partyMessage(), "Should return 'Happy Birthday' for a cake with 1 tier");
        }

        @Test
        public void testGetNumberOfTiers() {
            assertEquals(3, tieredCake.getNumberOfTiers(), "Should return 3 tiers");
        }

        @Test
        public void testSetNumberOfTiers() {
            tieredCake.setNumberOfTiers(5);
            assertEquals(5, tieredCake.getNumberOfTiers(), "Should set the number of tiers to 5");
        }
    }









}
