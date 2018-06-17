import java.util.Arrays;
import java.util.Scanner;

public class TripTest {
    public static void main(String[] args) {
        Trip[] trip = new Trip[3];

        boolean diff = false;
        int indeks = 0;

        while (!diff && indeks != trip.length) {
            System.out.println("Wprowadź dane:");
            Scanner scanner = new Scanner(System.in);

            Trip trip_obj = new Trip(scanner.nextLine(), scanner.nextInt());
            scanner.nextLine();

            boolean is = false;
            for (int i = 0; i < trip.length - 1; i++) {
                if (trip_obj.equals(trip[i])) {
                    System.out.println("Wprowadziłeś duplikat");
                    is = true;
                    break;
                }
            }

            if (!is) {
                trip[indeks] = trip_obj;
                indeks++;
            }
        }

        System.out.println(Arrays.toString(trip));
    }
}