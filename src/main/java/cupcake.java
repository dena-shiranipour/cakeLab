public class cupcake {
    public class Cupcake extends Cakes {
        // properties
        private int noOfCandles;

        // constructor
        public Cupcake(String name, String baseFlavour, boolean isHealthy, int noOfCandles) {
            super(name, baseFlavour, isHealthy);
            this.noOfCandles = noOfCandles;
        }

        // method
        public void lightCandles() {
            System.out.println("Candles are lit!");
        }

        // getter
        public int getNoOfCandles() {
            return noOfCandles;
        }

        // setter
        public void setNoOfCandles(int noOfCandles) {
            this.noOfCandles = noOfCandles;
        }
    }
}
