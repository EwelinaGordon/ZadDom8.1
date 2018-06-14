import java.util.Scanner;

public class TripTest {
    public static void main(String[] args) {
        Trip[] trip = new Trip[3];

        boolean diff = false;

        Scanner scanner = new Scanner(System.in);

        trip[0] = new Trip(scanner.nextLine(), scanner.nextInt());
        scanner.nextLine();


        for (int i = 1; i < 3; i++) {
            while (!diff) {
                System.out.println("Wprowadź obiekt: ");
                trip[i] = new Trip(scanner.nextLine(), scanner.nextInt());
                scanner.nextLine();
                if (trip[i].equals(trip[i - 1])) {
                    System.out.println("To jest duplikat");
                    i = i - 1;
                }
                diff = true;
            }
            diff = false;
        }

        for (Trip trip1 : trip) {
            System.out.println(trip1.toString());
        }
    }
}

