class SpaceEnv {
    private String planet;
    private double temperature; 
    private double gravity; 
    private double radiationLevel; 
    public SpaceEnv(String planet, double temperature, double gravity, double radiationLevel) {
        this.planet = planet;
        this.temperature = temperature;
        this.gravity = gravity;
        this.radiationLevel = radiationLevel;
    }

    public void displayInfo() {
        System.out.println("Planet: " + planet +
                           ", Temperature: " + temperature + "°C" +
                           ", Gravity: " + gravity + " m/s^2" +
                           ", Radiation Level: " + radiationLevel + " Sv/h");
    }

    public String getPlanet() {
        return planet;
    }
}

