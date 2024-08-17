class SpaceShip {
    private String name;
    private String mission;
    private double fuelLevel;
    private double payloadCapacity;
    private SpaceEnv environment; 
    private static int count;
    public SpaceShip(String name, String mission, double fuelLevel, double payloadCapacity, SpaceEnv environment) {
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
        this.environment = environment;
        this.count++;
    }

    public SpaceShip() {
    }

    public void displayInfo() {
        System.out.println("SpaceShip Name: " + name +"\n"+
                           " Mission: " + mission +"\n"+
                           "Fuel Level: " + fuelLevel +"\n"+
                           "Payload Capacity: " + payloadCapacity +"\n"+
                           "Operating Environment: " + environment.getPlanet());
    }

    public String getName() {
        return name;
    }

    public SpaceEnv getEnvironment() {
        return environment;
    }
    public static  int getCount(){
        return count;
    } 
}
