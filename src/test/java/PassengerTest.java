import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    ArrayList<Passenger> passengers;
    Flight flight;

    @Before
    public void setup(){
        passenger = new Passenger("Valentina",3);
        passengers = new ArrayList<Passenger>();
        flight = new Flight("FR756",passengers,PlaneType.BOEING747_100,"Pisa","Glasgow", LocalDate.of(2019,01,30));
    }

    @Test
    public void numberOfFlightIsNullBeforeBooking(){
        assertEquals(null,passenger.flightNumber());
    }

    @Test
    public void canLetPassengerFlightNumberBeingSetFromFlightClass(){
        assertEquals("FR756",passenger.setFlightNumber(flight));
    }

    @Test
    public void canGetNumberOfFlightWhenBooked(){
        flight.bookIn(passenger);
        assertEquals("FR756",passenger.flightNumber());
    }

    @Test
    public void getSeatNumberWhenBooked() {
        flight.bookIn(passenger);
        Integer test_integer = new Integer(0);
        assertEquals(test_integer.getClass(),passenger.getSeatNumber().getClass());
    }
}
