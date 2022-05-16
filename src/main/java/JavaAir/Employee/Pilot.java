package JavaAir.Employee;

import JavaAir.Flight.Flight;

public class Pilot extends Employee{

    private String licenceNo;

    public Pilot(String name, Rank rank, String licenceNo) {
        super(name, rank);
        this.licenceNo = licenceNo;
    }

    public String getLicenceNo() {
        return licenceNo;
    }

    public String fly(Flight flight){
        return String.format("%s flew %s from %s to %s", flight.getPilot().getName(), flight.getFlightNo(), flight.getDeparture(), flight.getDestination());
    }
}
