import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SpaceShip spaceShip = new SpaceShip("Chandrayaan-3", "Lunar Exploration", 100, 1000);
        SpaceEnv spaceEnv=new SpaceEnv("moon",45.3,1.2,0.2);
        Astronut astronut= new Astronut("mohana vamsi","cap",100, 98,spaceShip);
        System.out.println("Environment Analysis:");
        spaceEnv.displayInfo();
        System.out.println("Space Ship used info:");
        spaceShip.displayInfo();
        System.out.println("Astronut Detials:");
        astronut.displayInfo();
        scanner.close();
    }
}
