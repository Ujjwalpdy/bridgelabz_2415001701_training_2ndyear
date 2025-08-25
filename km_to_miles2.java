import java.util.Scanner;
public class km_to_miles2 {
    public static void main(String[] args) {
        double km, miles;

        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();

        // Conversion: 1 mile = 1.6 km
        miles = km / 1.6;

        // Output
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close();
    }
}

