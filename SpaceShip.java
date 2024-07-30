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
    public void  get(){
        System.out.println(this.name);
        System.err.println(this.fuelLevel);
        System.out.println(this.mission);
    }
}