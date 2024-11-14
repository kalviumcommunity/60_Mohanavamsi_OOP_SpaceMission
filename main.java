import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of missions:");
            int n = scanner.nextInt();
            scanner.nextLine();
            
            for (int i = 0; i < n; i++) {
                System.out.print("Mission Name: ");
                String mission = scanner.nextLine();
                System.out.print("Number of SpaceShips: ");
                int ships = scanner.nextInt();
                scanner.nextLine();
                
                SpaceEnv spaceEnv = createEnvironment(scanner);
                
                SpaceShip[] spaceShips = new SpaceShip[ships];
                
                for (int j = 0; j < ships; j++) {
                    spaceShips[j] = createSpaceShip(scanner, mission, spaceEnv);
                    spaceShips[j].displayInfo();
                    
                    System.out.print("Number of Astronauts: ");
                    int numAstronauts = scanner.nextInt();
                    scanner.nextLine();
                    
                    Astronaut[] astronauts = new Astronaut[numAstronauts];
                    
                    for (int k = 0; k < numAstronauts; k++) {
                        astronauts[k] = createAstronaut(scanner, mission, spaceShips[j]);
                        astronauts[k].displayInfo();
                    }
                }
                
                System.out.println("Mission " + (i + 1) + " Environment:");
                spaceEnv.displayInfo();
            }
            
            System.out.println("Total Ships: " + SpaceVehicle.getCount());
            System.out.println("Total Astronauts: " + Astronaut.getCount());
            System.out.println("Total Environments: " + SpaceEnv.getCount());
        }
    }
    
    // Method to create and return a SpaceEnv object
    private static SpaceEnv createEnvironment(Scanner scanner) {
        System.out.print("Planet: ");
        String planet = scanner.nextLine();
        System.out.print("Temperature: ");
        double temperature = scanner.nextDouble();
        System.out.print("Gravity: ");
        double gravity = scanner.nextDouble();
        System.out.print("Radiation Level: ");
        double radiationLevel = scanner.nextDouble();
        scanner.nextLine();
        
        return new SpaceEnv(planet, temperature, gravity, radiationLevel);
    }

    // Method to create and return a SpaceShip object
    private static SpaceShip createSpaceShip(Scanner scanner, String mission, SpaceEnv spaceEnv) {
        System.out.print("SpaceShip Name: ");
        String name = scanner.nextLine();
        System.out.print("Fuel Level: ");
        double fuelLevel = scanner.nextDouble();
        System.out.print("Payload Capacity: ");
        double payloadCapacity = scanner.nextDouble();
        scanner.nextLine();
        
        return new SpaceShip(name, mission, fuelLevel, payloadCapacity, spaceEnv);
    }
    
    // Method to create and return an Astronaut object
    private static Astronaut createAstronaut(Scanner scanner, String mission, SpaceShip assignedSpaceShip) {
        System.out.print("Astronaut Name: ");
        String astroName = scanner.nextLine();
        System.out.print("Role: ");
        String role = scanner.nextLine();
        System.out.print("Oxygen Level: ");
        double oxygenLevel = scanner.nextDouble();
        System.out.print("Health: ");
        int health = scanner.nextInt();
        scanner.nextLine();
        
        return new Astronaut(astroName, role, oxygenLevel, health, assignedSpaceShip, mission);
    }
}
