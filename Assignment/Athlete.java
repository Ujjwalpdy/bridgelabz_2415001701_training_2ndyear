import java.util.Scanner;

public class Athlete {
    public static double calculateRounds(int a, int b, int c, double distance) {
        int perimeter = a + b + c;
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of triangle (in meters): ");
        int a = sc.nextInt();

        System.out.print("Enter side 2 of triangle (in meters): ");
        int b = sc.nextInt();

        System.out.print("Enter side 3 of triangle (in meters): ");
        int c = sc.nextInt();

        double rounds = calculateRounds(a, b, c, 5000);
        System.out.println("The athlete must complete " + rounds + " rounds to cover 5 km.");
    }
}
