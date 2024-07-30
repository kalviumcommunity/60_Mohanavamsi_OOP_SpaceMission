import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SpaceShip spaceShip = new SpaceShip();
        SpaceEnv spaceEnv=new SpaceEnv();
        Astronut astronut=new Astronut();
        astronut.hi();
        spaceEnv.hi();
        spaceShip.hi();
        scanner.close();
    }
}
