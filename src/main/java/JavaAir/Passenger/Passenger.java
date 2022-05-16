package JavaAir.Passenger;

public class Passenger {

    private String name;
    private int NoOfBags;

    public Passenger(String name, int noOfBags) {
        this.name = name;
        NoOfBags = noOfBags;
    }

    public String getName() {
        return name;
    }

    public int getNoOfBags() {
        return NoOfBags;
    }


}
