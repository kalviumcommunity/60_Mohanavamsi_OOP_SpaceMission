class Astronut {
    private String name;
    private String role;
    private double oxygenLevel; 
    private boolean isHealthy; 
    private SpaceShip assignedSpaceShip; 
    private String mission;
    private static int count = 0;

    // Constructor with parameters
    public Astronut(String name, String role, double oxygenLevel, int health, SpaceShip assignedSpaceShip, String mission) {
        this.name = name;
        this.role = role;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy = health >= 60; // Health based on threshold
        this.mission = mission;
        this.assignedSpaceShip = assignedSpaceShip;
        count++;
    }

    // Default constructor
    public Astronut() {
        count++;
    }

    // Getter and Setter methods for encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean isHealthy) {
        this.isHealthy = isHealthy;
    }

    public SpaceShip getAssignedSpaceShip() {
        return assignedSpaceShip;
    }

    public void setAssignedSpaceShip(SpaceShip assignedSpaceShip) {
        this.assignedSpaceShip = assignedSpaceShip;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    // Static method to get the count of Astronaut objects
    public static int getCount() {
        return count;
    }

    // Method to display information about the astronaut
    public void displayInfo() {
        System.out.println("Astronaut Name: " + name + "\n" +
                           "Role: " + role + "\n" +
                           "Oxygen Level: " + oxygenLevel + "%" + "\n" +
                           "Health Status: " + (isHealthy ? "Healthy" : "Unhealthy") + "\n" +
                           "In Mission: " + mission + "\n" +
                           "Assigned SpaceShip: " + (assignedSpaceShip != null ? assignedSpaceShip.getName() : "None") + "\n" +
                           "Operating Environment: " + (assignedSpaceShip != null ? assignedSpaceShip.getEnvironment().getPlanet() : "Unknown"));
    }
}
