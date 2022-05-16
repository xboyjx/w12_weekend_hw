package PassengerTest;

import JavaAir.Passenger.Passenger;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Jacob", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Jacob", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getNoOfBags());
    }
}
