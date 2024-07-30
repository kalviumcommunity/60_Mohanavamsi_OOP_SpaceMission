class Astronut {
    private String name;
    private String role;
    private double oxygenLevel; 
    private boolean isHealthy; 
    private SpaceShip assignedSpaceShip; 

    public Astronut(String name, String role, double oxygenLevel, int Healthy, SpaceShip assignedSpaceShip) {
        this.name = name;
        this.role = role;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy=Healthy>=60;
        this.assignedSpaceShip = assignedSpaceShip;
    }

    public void displayInfo() {
        System.out.println("Astronaut Name: " +  this.name + "\n"+
                           "Role: " +  this.role + "\n"+
                           "Oxygen Level: " +  this.oxygenLevel + "%" +"\n"+
                           "Health Status: " + ( this.isHealthy ? "Healthy" : "Unhealthy") +"\n"+
                           "Assigned SpaceShip: " + ( this.assignedSpaceShip != null ? assignedSpaceShip.getName() : "None"));
    }
}