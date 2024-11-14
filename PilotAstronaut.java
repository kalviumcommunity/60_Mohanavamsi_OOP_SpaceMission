public class PilotAstronaut extends Astronaut implements Pilot {
    public PilotAstronaut(String name, String role, double oxygenLevel, int health, SpaceShip assignedSpaceShip, String mission) {
        super(name, role, oxygenLevel, health, assignedSpaceShip, mission);
    }

    @Override
    public void navigate(SpaceVehicle vehicle) {
        System.out.println(name + " is navigating the " + vehicle.getName());
    }
}
