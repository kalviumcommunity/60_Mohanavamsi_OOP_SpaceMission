public class SpaceShip {
    private String name;
    private String mission;
    private double fuelLevel;
    private double payloadCapacity;

    public SpaceShip(String name, String mission, double fuelLevel, double payloadCapacity) {
        this.name = name;
        this.mission = mission;
        this.fuelLevel = fuelLevel;
        this.payloadCapacity = payloadCapacity;
    }
    public String  getName(){
        return this.name;
    };
     public double  getFuel(){
        return this.fuelLevel;
    };
    public String  getMisson(){
        return this.mission;
    };
    public void displayInfo(){
        System.out.println("Misson: " +  this.mission + "\n"+
                            "SpaceShip Name: " + this.name+"\n"+
                            "payloadCapacity: "+this.payloadCapacity+"\n"+
                           "Fuel Level: " +  this.fuelLevel + "%" +"\n");
    }
}