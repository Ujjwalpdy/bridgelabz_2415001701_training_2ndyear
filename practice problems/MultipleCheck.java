import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println("Cannot divide by zero");
        } else if (n % m == 0) {
            System.out.println(n + " is a multiple of " + m);
        } else {
            System.out.println(n + " is NOT a multiple of " + m);
        }
        sc.close();
    }
}
