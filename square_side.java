import java.util.Scanner;
public class square_side {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for perimeter
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = input.nextDouble();

        // Formula: Perimeter = 4 × side  =>  side = perimeter / 4
        double side = perimeter / 4;

        // Output
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}
