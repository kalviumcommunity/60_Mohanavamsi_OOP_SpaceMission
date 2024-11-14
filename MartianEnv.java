public class MartianEnv extends SpaceEnv {
    private boolean hasDustStorms;

    public MartianEnv(double temperature, double gravity, double radiationLevel, boolean hasDustStorms) {
        super("Mars", temperature, gravity, radiationLevel);
        this.hasDustStorms = hasDustStorms;
    }

    public boolean isDustStormActive() {
        return hasDustStorms;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Dust Storms Active: " + (hasDustStorms ? "Yes" : "No"));
    }
}
 {
    
}
