import java.util.Scanner;

public class SmallestCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Check if first is smallest
        boolean isSmallest = (number1 < number2 && number1 < number3);

        // Output
        System.out.println("Is the first number the smallest? " + isSmallest);

        sc.close();
    }
}
