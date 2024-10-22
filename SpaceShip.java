public class SpaceShip extends SpaceVehicle {
    private SpaceEnv environment;

    public SpaceShip(String name, String mission, double fuelLevel, double payloadCapacity, SpaceEnv environment) {
        super(name, mission, fuelLevel, payloadCapacity);
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
        this.environment = environment;
    }

    @Override
    public void displayInfo() {
        System.out.println("SpaceShip Name: " + getName() + "\nFuel Level: " + getFuelLevel() + "\nMission: " + environment.getPlanet());
    }

    public SpaceEnv getEnvironment() {
        return environment;
    }
}