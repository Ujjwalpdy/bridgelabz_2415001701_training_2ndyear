import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        int[] digits = new int[count];
        int[] reverseDigits = new int[count];

        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reverseDigits[i]);
        }

        sc.close();
    }
}
