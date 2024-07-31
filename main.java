import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of missions:");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Mission " + (i + 1) + ":");
            System.out.print("Mission Name: ");
            String mission = scanner.nextLine();

            System.out.print("Number of SpaceShips: ");
            int ships = scanner.nextInt();
            scanner.nextLine(); 
            SpaceShip[] spaceShips = new SpaceShip[ships];

            System.out.println("Enter Environment Details for Mission " + (i + 1) + " (Temperature, Gravity, Radiation Level):");
            System.out.print("Planet: ");
            String Planet=scanner.nextLine(); 
            System.out.print("Temperature: ");
            double temperature = scanner.nextDouble();
            System.out.print("Gravity: ");
            double gravity = scanner.nextDouble();
            System.out.print("Radiation Level: ");
            double radiationLevel = scanner.nextDouble();
            scanner.nextLine(); 

            SpaceEnv spaceEnv = new SpaceEnv(Planet, temperature, gravity, radiationLevel);

            for (int j = 0; j < ships; j++) {
                System.out.println("Enter details for SpaceShip " + (j + 1) + ":");
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Fuel Level: ");
                double fuelLevel = scanner.nextDouble();
                System.out.print("Payload Capacity: ");
                double payloadCapacity = scanner.nextDouble();
                scanner.nextLine(); 
                spaceShips[j] = new SpaceShip(name, mission, fuelLevel, payloadCapacity, spaceEnv);

                System.out.print("Number of Astronauts: ");
                int numAstronauts = scanner.nextInt();
                scanner.nextLine(); 

                Astronut[] astronauts = new Astronut[numAstronauts];

                for (int k = 0; k < numAstronauts; k++) {
                    System.out.println("Enter details for Astronaut " + (k + 1) + ":");
                    System.out.print("Name: ");
                    String astroName = scanner.nextLine();
                    System.out.print("Role: ");
                    String role = scanner.nextLine();
                    System.out.print("Oxygen Level: ");
                    double oxygenLevel = scanner.nextDouble();
                    System.out.print("Health: ");
                    int health = scanner.nextInt();
                    scanner.nextLine(); 

                    astronauts[k] = new Astronut(astroName, role, oxygenLevel, health, spaceShips[j], mission);
                }

                for (int k = 0; k < numAstronauts; k++) {
                    System.out.println("Astronaut " + (k + 1) + " Details:");
                    astronauts[k].displayInfo();
                }
            }

            System.out.println("Environment Analysis:");
            spaceEnv.displayInfo();

            for (int j = 0; j < ships; j++) {
                System.out.println("Space Ship " + (j + 1) + " Info:");
                spaceShips[j].displayInfo();
            }
        }


        scanner.close();
    }
}
