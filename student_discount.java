import java.util.Scanner;
public class student_discount {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        // Take user input for discount percent
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount
        double discount = (fee * discountPercent) / 100;

        // Final fee after discount
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);

        input.close();
    }
}
