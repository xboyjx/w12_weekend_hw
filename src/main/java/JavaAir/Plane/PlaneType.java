package JavaAir.Plane;

public enum PlaneType {

    BOEING747(20, 3000),
    BOEING474(25, 4000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
