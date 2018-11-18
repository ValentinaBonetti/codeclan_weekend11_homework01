import java.util.ArrayList;
import java.time.LocalDate;

public class Flight {

    private String flight_number;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String destination_airport;
    private String departure_airport;
    private LocalDate departure_time;

    public Flight(String flight_number, ArrayList<Passenger> passengers, PlaneType planeType, String destination_airport, String departure_airport, LocalDate departure_time) {
        this.flight_number = flight_number;
        this.passengers = passengers;
        this.planeType = planeType;
        this.destination_airport = destination_airport;
        this.departure_airport = departure_airport;
        this.departure_time = departure_time;
    }


    public int checkAvailableSeats() {
        return (planeType.getMaxPassengers()-passengers.size());
    }

    public void bookIn(Passenger passenger) {
        if (this.checkAvailableSeats()>0) {
            this.passengers.add(passenger);
        }
    }

    public double getMaxWeightPerBag() {
        return this.planeType.getWeightPerBag();
    }

    public double howMuchBaggageWeightIsBooked() {
        double total_booked_weight = 0;
        for(Passenger passenger: this.passengers) {
            total_booked_weight += passenger.number_of_bags()*this.planeType.getWeightPerBag();
        }
        return total_booked_weight;
    }

    public double howMuchBaggageWeightRemains() {
        return (this.planeType.getWeight()/2.0-this.howMuchBaggageWeightIsBooked());
    }
}
