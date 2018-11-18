public enum PlaneType {

    BOEING747_100(333400,420),
    BOEING747_400(457000,560);

    private final double weight;
    private final int maxPassengers;
    private int maxBagsPerPassenger;

    PlaneType(double weight, int maxPassengers) {
        this.weight = weight;
        this.maxPassengers = maxPassengers;
        this.maxBagsPerPassenger = 10;
    }

    public double getWeight() {
        return weight;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public double getWeightPerBag(){
        return this.weight/(2.0*this.maxPassengers*this.maxBagsPerPassenger);
    }
}
