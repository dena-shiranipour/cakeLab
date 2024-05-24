public class Cakes {
    // fixed base flavors
    public static final String HONEY_FLAVOUR = "Honey Cake";
    public static final String CHOCOLATE_FLAVOUR = "Chocolate Cake";

    // properties of the Cakes class
    protected String name;
    protected String baseFlavour;
    protected boolean isHealthy;

    // constructor
    public Cakes(String name, String baseFlavour, boolean isHealthy) {
        this.name = name;
        this.baseFlavour = baseFlavour;
        this.isHealthy = isHealthy;
    }

    // getter for baseFlavour
    public String getBaseFlavour() {
        return baseFlavour;
    }

    // getter for isHealthy
    public boolean isHealthy() {
        return isHealthy;
    }
}
