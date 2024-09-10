class SpaceEnv {
    private String planet;
    private double temperature; 
    private double gravity; 
    private double radiationLevel;
    private static int count = 0;

    // Constructor with parameters
    public SpaceEnv(String planet, double temperature, double gravity, double radiationLevel) {
        this.planet = planet;
        this.temperature = temperature;
        this.gravity = gravity;
        this.radiationLevel = radiationLevel;
        count++;
    }

    public SpaceEnv() {
        count++;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }

    public double getRadiationLevel() {
        return radiationLevel;
    }

    public void setRadiationLevel(double radiationLevel) {
        this.radiationLevel = radiationLevel;
    }

    public static int getCount() {
        return count;
    }
    public void displayInfo() {
        System.out.println("Planet: " + planet + "\n" +
                           "Temperature: " + temperature + "°C\n" +
                           "Gravity: " + gravity + " m/s²\n" +
                           "Radiation Level: " + radiationLevel + " Sv/h");
    }
}
