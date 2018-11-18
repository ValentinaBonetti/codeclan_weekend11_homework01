public class Passenger {

    private String name;
    private int number_of_bags;
    private String flightNumber;
    private Integer seat_number;

    public Passenger(String name, int number_of_bags) {
        this.name = name;
        this.number_of_bags = number_of_bags;
        this.flightNumber = null;
        this.seat_number = null;
    }

    public int number_of_bags() {
        return number_of_bags;
    }

    public String flightNumber() {
        return this.flightNumber;
    }

    public Integer getSeatNumber() {
        return seat_number;
    }

    public void setSeatNumber(Integer seat_number) {
        this.seat_number = seat_number;
    }

    public String setFlightNumber(Flight flight) {
        this.flightNumber = flight.flight_number();
        return this.flightNumber;
    }

}
