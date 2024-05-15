public class Cakes {
    //fixed based flavours
    public static final String honeyFlavour = "Honey";
    public static final String chocolateFlavour = "Chocolate";



    public static class Cake {
        // properties
        private String name;
        private String baseFlavour;
        private boolean isHealthy;

        // constructor
        public Cakes(String name, String baseFlavour, boolean isHealthy) {
            this.name = name;
            this.baseFlavour = baseFlavour;
            this.isHealthy = isHealthy;
        }

        // method
        public boolean isHealthy() {
            return isHealthy;
        }
    }










}
