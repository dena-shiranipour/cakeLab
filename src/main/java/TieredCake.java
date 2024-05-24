public class TieredCake extends Cakes {
    private int numberOfTiers;

    // constructor
    public TieredCake(String name, String baseFlavour, boolean isHealthy, int numberOfTiers) {
        super(name, baseFlavour, isHealthy);
        this.numberOfTiers = numberOfTiers;
    }

    // method
    public String partyMessage() {
        if (numberOfTiers > 2) {
            return "So many candles";
        } else {
            return "Happy Birthday";
        }
    }

    // getter
    public int getNumberOfTiers() {
        return numberOfTiers;
    }

    // setter
    public void setNumberOfTiers(int numberOfTiers) {
        this.numberOfTiers = numberOfTiers;
    }
}
