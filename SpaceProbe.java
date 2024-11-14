public class SpaceProbe extends SpaceVehicle {
    public SpaceProbe(String name, String mission, double fuelLevel, double payloadCapacity) {
        super(name, mission, fuelLevel, payloadCapacity);
    }

    @Override
    public void displayInfo() {
        System.out.println("Space Probe Name: " + getName() + "\nMission: " + mission);
    }
}
