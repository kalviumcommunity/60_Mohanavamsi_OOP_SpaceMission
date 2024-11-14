public class SpaceEnv {
    private String planet;
    private double temperature;
    private double gravity;
    private double radiationLevel;
    private static int count = 0;

    public SpaceEnv(String planet, double temperature, double gravity, double radiationLevel) {
        this.planet = planet;
        this.temperature = temperature;
        this.gravity = gravity;
        this.radiationLevel = radiationLevel;
        count++;
    }

    public String getPlanet() {
        return planet;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getGravity() {
        return gravity;
    }

    public double getRadiationLevel() {
        return radiationLevel;
    }

    public static int getCount() {
        return count;
    }

    public void displayInfo() {
        System.out.println("Planet: " + planet +
                "\nTemperature: " + temperature + "°C" +
                "\nGravity: " + gravity + " m/s²" +
                "\nRadiation Level: " + radiationLevel + " Sv/h");
    }
}
