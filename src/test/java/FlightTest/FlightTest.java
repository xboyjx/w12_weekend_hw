package FlightTest;

import JavaAir.Employee.CabinCrewMember;
import JavaAir.Employee.Pilot;
import JavaAir.Employee.Rank;
import JavaAir.Flight.Flight;
import JavaAir.Passenger.Passenger;
import JavaAir.Plane.Plane;
import JavaAir.Plane.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;
    Plane plane;
    CabinCrewMember cabinCrewMember;
    Passenger passenger;


    @Before
    public void before(){
        pilot = new Pilot("John", Rank.MANAGER, "DB74");
        plane = new Plane(PlaneType.BOEING747);

        flight = new Flight(pilot, plane, "1", "AGP", "EDI", "14:00");
    }

    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void flightHasFlightNo(){
        assertEquals("1",flight.getFlightNo());
    }

    @Test
    public void flightHasDestination(){
        assertEquals("AGP", flight.getDestination());
    }

    @Test
    public void flightHasDeparture(){
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void flightHasDepartureTime(){
        assertEquals("14:00", flight.getDepartureTime());
    }

    @Test
    public void flightHasCrewMemberList(){
        assertEquals(0, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightHasPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void flightCanAddCabinCrewMembers(){
        flight.addCabinCrewMember(cabinCrewMember);
        assertEquals(1, flight.getCabinCrewMembers().size());
    }

    @Test
    public void flightCanShowNumberOfSeats(){
        assertEquals(20, flight.numberOfSeats());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("John flew 1 from EDI to AGP", pilot.fly(flight));
    }
}
