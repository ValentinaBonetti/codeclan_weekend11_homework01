import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager manager;
    Flight flight;
    Passenger passenger_01;
    Passenger passenger_02;
    Passenger passenger_03;
    ArrayList<Passenger> passengers;


    @Before
    public void setup(){
        passenger_01 = new Passenger("Valentina",2);
        passenger_02 = new Passenger("Lucifero",1);
        passenger_03 = new Passenger("Alberto",3);
        passengers = new ArrayList<Passenger>();
        passengers.add(passenger_01);
        passengers.add(passenger_02);
        flight = new Flight("FR756",passengers,PlaneType.BOEING747_100,"Pisa","Glasgow", LocalDate.of(2019,01,30));
        manager = new FlightManager();

    }

    @Test
    public void canCheckHowMuchBaggageWeightIsBooked(){
        assertEquals((2+1)*(333400.0/(2*420.0*10)),manager.chechHowMuchBaggageWeightIsBooked(flight),0.01);

    }

    @Test
    public void canCheckHowMuchBaggageWeightRemains(){
        assertEquals(333400.0/2-(2+1)*(333400.0/(2*420.0*10)),manager.chechHowMuchBaggageWeightRemains(flight),0.01);
    }


}
