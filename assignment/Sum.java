import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;
        double num;

        System.out.println("Enter numbers to add (enter 0 to stop):");

        while (true) {
            num = sc.nextDouble();

            if (num == 0) {
                break;
            }

            total += num;
        }

        System.out.println("The total sum is: " + total);
        sc.close();
    }
}
