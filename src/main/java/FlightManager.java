public class FlightManager {

    private Flight flight;

    public double chechHowMuchBaggageWeightIsBooked(Flight flight) {
        return flight.howMuchBaggageWeightIsBooked();
    }

    public double chechHowMuchBaggageWeightRemains(Flight flight) {
        return flight.howMuchBaggageWeightRemains();
    }

    public void assignSeatNumber(Flight flight, Passenger passenger) {
        passenger.setSeatNumber(flight.giveRandomSeatNumber(passenger));
    }

}
