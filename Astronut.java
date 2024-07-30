class Astronut {
    private String name;
    private String role;
    private String skill;
    private double oxygenLevel; 
    private boolean isHealthy; 
    private SpaceShip assignedSpaceShip; 

    // Constructor
    public Astronut(String name, String role, String skill, double oxygenLevel, int Healthy, SpaceShip assignedSpaceShip) {
        this.name = name;
        this.role = role;
        this.skill = skill;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy = Healthy>=60;
        this.assignedSpaceShip = assignedSpaceShip;
    }

    public void displayInfo() {
        System.out.println("Astronaut Name: " + name + 
                           ", Role: " + role + 
                           ", Skill: " + skill + 
                           ", Oxygen Level: " + oxygenLevel + "%" +
                           ", Health Status: " + (isHealthy ? "Healthy" : "Unhealthy") +
                           ", Assigned SpaceShip: " + (assignedSpaceShip != null ? assignedSpaceShip.getName() : "None"));
    }

    public void updateOxygenLevel(double level) {
        this.oxygenLevel = level;
        System.out.println(name + "'s oxygen level updated to: " + oxygenLevel + "%.");
    }

    public void updateHealthStatus(boolean status) {
        this.isHealthy = status;
        System.out.println(name + "'s health status updated to: " + (isHealthy ? "Healthy" : "Unhealthy") + ".");
    }
}