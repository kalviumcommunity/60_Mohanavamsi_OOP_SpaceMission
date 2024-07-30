import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create a SpaceShip object
        SpaceShip spaceShip = new SpaceShip("Chandrayaan-3", "Lunar Exploration", 100, 1000);
        spaceShip.get();

        System.out.println("Enter the number of Astronauts:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Astronut[] astronauts = new Astronut[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Astronaut " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Role: ");
            String role = scanner.nextLine();
            System.out.print("Skill: ");
            String skill = scanner.nextLine();

            astronauts[i] = new Astronut(name, role, skill);
        }

        System.out.println("\nAstronaut Details:");
        for (Astronut astronaut : astronauts) {
            astronaut.displayInfo();
        }

        scanner.close();
    }
}
