import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Passenger passenger_01;
    Passenger passenger_02;
    Passenger passenger_03;
    ArrayList<Passenger> passengers;

    @Before
    public void setUp(){
        passenger_01 = new Passenger("Valentina",2);
        passenger_02 = new Passenger("Lucifero",1);
        passenger_03 = new Passenger("Alberto",3);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger_01);
        passengers.add(passenger_02);
        flight = new Flight("FR756",passengers,PlaneType.BOEING747_100,"Pisa","Glasgow","2018-12-22-0940");
    }

    @Test
    public void canCheckAvailableSeats(){
        assertEquals(418,flight.checkAvailableSeats());
    }

    @Test
    public void canBookAPassenger(){
        flight.bookIn(passenger_03);
        assertEquals(417,flight.checkAvailableSeats());
    }

    @Test
    public void canGetMaxWeightPerBag(){
        double actual_max = flight.getMaxWeightPerBag();
        double expected_max = 333400.0/(2*420.0*10); // 39.0 kg
        assertEquals(expected_max,actual_max,0.01);
    }

    @Test
    public void howMuchBaggageWeightIsBooked() {
        assertEquals(3*(333400.0/(2*420.0*10)), flight.howMuchBaggageWeightIsBooked(),0.01);
    }

    @Test
    public void howMuchBaggageWeightRemains() {
        assertEquals(333400.0/2-3*(333400.0/(2*420.0*10)),flight.howMuchBaggageWeightRemains(),0.01);
    }
}
