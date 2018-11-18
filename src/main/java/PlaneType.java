public enum PlaneType {

    BOEING747_100(333400,420),
    BOEING747_400(457000,560);

    private final int weight;
    private final int passengers;

    PlaneType(int weight, int passengers) {
        this.weight = weight;
        this.passengers = passengers;
    }

    public int getWeight() {
        return weight;
    }

    public int getPassengers() {
        return passengers;
    }
}
