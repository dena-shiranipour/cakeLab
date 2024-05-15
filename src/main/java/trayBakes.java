public class trayBakes {

    public class Traybake extends Cakes {
        // property
        private int numberOfServings;

        // constructor
        public Traybake(String name, String baseFlavour, boolean isHealthy, int numberOfServings) {
            super(name, baseFlavour, isHealthy);
            this.numberOfServings = numberOfServings;
        }

        // method
        public String cutCake() {
            if (numberOfServings > 3) {
                return "Cut the cake!";
            } else {
                return "The cake doesn't need cutting";
            }
        }

        // getter
        public int getNumberOfServings() {
            return numberOfServings;
        }

        // setter
        public void setNumberOfServings(int numberOfServings) {
            this.numberOfServings = numberOfServings;
        }
    }



}
