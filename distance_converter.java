import java.util.Scanner;
public class distance_converter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input in feet
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        // 1 yard = 3 feet → yards = feet / 3
        double yards = feet / 3;

        // 1 mile = 1760 yards → miles = yards / 1760
        double miles = yards / 1760;

        // Output
        System.out.println("The distance in feet is " + feet +
                           " which is " + yards + " yards or " + miles + " miles.");

        input.close();
    }
}

