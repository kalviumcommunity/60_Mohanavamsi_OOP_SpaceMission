public class Astronaut {
    private final String name;
    private final String role;
    private final double oxygenLevel;
    private final boolean isHealthy;
    private final SpaceShip assignedSpaceShip;
    private final String mission;
    private  static int count = 0;

    public Astronaut(String name, String role, double oxygenLevel, int health, SpaceShip assignedSpaceShip, String mission) {
        this.name = name;
        this.role = role;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy = health >= 60;
        this.mission = mission;
        this.assignedSpaceShip = assignedSpaceShip;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void displayInfo() {
        System.out.println("Astronaut Name: " + name + "\nRole: " + role + "\nOxygen Level: " + oxygenLevel + "%\nHealth Status: " + (isHealthy ? "Healthy" : "Unhealthy") + "\nMission: " + mission);
    }
}
