class SpaceShip {
    private String name;
    private String mission;
    private double fuelLevel;
    private double payloadCapacity;
    private SpaceEnv environment; 

    // Constructor
    public SpaceShip(String name, String mission, double fuelLevel, double payloadCapacity, SpaceEnv environment) {
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
        this.environment = environment;
    }

    public void displayInfo() {
        System.out.println("SpaceShip Name: " + name +
                           ", Mission: " + mission +
                           ", Fuel Level: " + fuelLevel +
                           ", Payload Capacity: " + payloadCapacity +
                           ", Operating Environment: " + environment.getPlanet());
    }

    public String getName() {
        return name;
    }

    public SpaceEnv getEnvironment() {
        return environment;
    }
}
