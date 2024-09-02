class Astronut {
     String name;
     String role;
     double oxygenLevel; 
     boolean isHealthy; 
     SpaceShip assignedSpaceShip; 
     String mission;
     static int count;


    public Astronut(String name, String role, double oxygenLevel, int Healthy, SpaceShip assignedSpaceShip,String mission) {
        this.name = name;
        this.role = role;
        this.oxygenLevel = oxygenLevel;
        this.isHealthy=Healthy>=60;
        this.mission=mission;
        this.assignedSpaceShip = assignedSpaceShip;
        this.count++;

    }

    public Astronut() {
    }

    public void displayInfo() {
        System.out.println("Astronaut Name: " +  this.name + "\n"+
                           "Role: " +  this.role + "\n"+
                           "Oxygen Level: " +  this.oxygenLevel + "%" +"\n"+
                           "Health Status: " + ( this.isHealthy ? "Healthy" : "Unhealthy") +"\n"+
                           "In_Mission: " +this.mission+"\n"+
                           "Assigned SpaceShip: " + ( this.assignedSpaceShip != null ? assignedSpaceShip.getName() : "None")+"\n"+
                           "Operating Environment: " + assignedSpaceShip.getEnvironment().getPlanet());

    }
    public static  int getCount(){
        return count;
    } 
}