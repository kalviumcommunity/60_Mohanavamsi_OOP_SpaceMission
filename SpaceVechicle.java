abstract class SpaceVehicle {
    protected String name;
    protected String mission;
    protected double fuelLevel;
    protected double payloadCapacity;

    public SpaceVehicle(String name, String mission, double fuelLevel, double payloadCapacity) {
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
    }

    public abstract void displayInfo();

    public double getFuelLevel() {
        return fuelLevel;
    }
}
