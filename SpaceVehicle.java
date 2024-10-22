 public abstract class SpaceVehicle {
    private String name;
    private String mission;
    private double fuelLevel;
    private double payloadCapacity;
    private static int count = 0;

    public SpaceVehicle(String name, String mission, double fuelLevel, double payloadCapacity) {
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
        count++;
    }

    public abstract void displayInfo();

    public double getFuelLevel() {
        return fuelLevel;
    }

    public String getName() {
        return name;
    }

    public static int getCount() {
        return count;
    }
}
