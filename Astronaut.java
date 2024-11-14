public class Astronaut {
    private String name;
    private String role;
    private double oxygenLevel;
    private boolean isHealthy;
    private SpaceShip assignedSpaceShip;
    private String mission;
    private static int count = 0;

    public Astronaut(String name, String role, double oxygenLevel, int health, SpaceVehicle assignedSpaceShip2, String mission) {
        this.name = name;
        this.role = role;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy = health >= 60;
        this.mission = mission;
        this.assignedSpaceShip = assignedSpaceShip2;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void displayInfo() {
        System.out.println("Astronaut Name: " + name +
                "\nRole: " + role +
                "\nOxygen Level: " + oxygenLevel + "%" +
                "\nHealth Status: " + (isHealthy ? "Healthy" : "Unhealthy") +
                "\nMission: " + mission);
    }
}

