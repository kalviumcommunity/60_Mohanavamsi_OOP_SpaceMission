class SpaceShip extends SpaceVehicle {
    private SpaceEnv environment;
    private static int count = 0;

    public SpaceShip(String name, String mission, double fuelLevel, double payloadCapacity, SpaceEnv environment) {
        super(name, mission, fuelLevel, payloadCapacity);
        this.environment = environment;
        count++;
    }
    public SpaceShip() {
        count++;
    }

    @Override
    public void displayInfo() {
        System.out.println("SpaceShip Name: " + name + "\n" +
                           "Mission: " + mission + "\n" +
                           "Fuel Level: " + fuelLevel + "\n" +
                           "Payload Capacity: " + payloadCapacity + "\n" +
                           "Operating Environment: " + environment.getPlanet());
    }

    public static int getCount() {
        return count;
    }
}
