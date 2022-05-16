package JavaAir.Employee;

public class CabinCrewMember extends Employee{

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String message(String message){
        return String.format("I love %s", message);
    }
}
