import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        num = Math.abs(num);
        if (num < 10) {
            System.out.println("No second last digit exists");
        } else {
            int secondLast = (num / 10) % 10;
            System.out.println("Second Last Digit: " + secondLast);
        }
        sc.close();
    }
}
