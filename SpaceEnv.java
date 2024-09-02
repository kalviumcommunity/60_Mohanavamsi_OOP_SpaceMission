class SpaceEnv {
     String planet;
     double temperature; 
     double gravity; 
     double radiationLevel;
     static int count;
    public SpaceEnv(String planet, double temperature, double gravity, double radiationLevel) {
        this.planet = planet;
        this.temperature = temperature;
        this.gravity = gravity;
        this.radiationLevel = radiationLevel;
        this.count++;
    }

    public SpaceEnv() {
        
    }

    public void displayInfo() {
        System.out.println("Planet: " + planet +"\n"+
                           "Temperature: " + temperature + "°C" +"\n"+
                           "Gravity: " + gravity + " m/s^2" +"\n"+
                           "Radiation Level: " + radiationLevel + " Sv/h");
    }

    public String getPlanet() {
        return planet;
    }
    public static  int getCount(){
        return count;
    } 
}

