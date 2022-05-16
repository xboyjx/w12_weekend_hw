package JavaAir.Flight;

import JavaAir.Employee.CabinCrewMember;
import JavaAir.Employee.Pilot;
import JavaAir.Passenger.Passenger;
import JavaAir.Plane.Plane;

import java.util.ArrayList;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNo, String destination, String departure, String departureTime) {
        this.pilot = pilot;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public ArrayList<CabinCrewMember> getCabinCrewMembers() {
        return cabinCrewMembers;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }

    public void addCabinCrewMember(CabinCrewMember cabinCrewMember){
        cabinCrewMembers.add(cabinCrewMember);
    }

    public int numberOfSeats(){
        return plane.getPlaneType().getCapacity();
    }
}
