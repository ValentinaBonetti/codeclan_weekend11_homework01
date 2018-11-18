public class Passenger {

    private String name;
    private int number_of_bags;

    public Passenger(String name, int number_of_bags) {
        this.name = name;
        this.number_of_bags = number_of_bags;
    }

    public int number_of_bags() {
        return number_of_bags;
    }
}
