public class SpaceEnv {
    private String planet;
    private double temperature; 
    private double gravity;
    private double AirRate;

    public  SpaceEnv(String planet,double temperature,double gravity,double AirRate){
        this.planet=planet;
        this.temperature=temperature;
        this.gravity=gravity;
        this.AirRate=AirRate;
    }

    public void displayInfo(){
        System.out.println("Planet -> "+this.planet + "\n" +
      "temperature -> "+this.temperature + "\n" +
       "Gravity -> " +this.gravity + "\n" +
        "AirRate -> "+this.AirRate+"\n");
    }


}