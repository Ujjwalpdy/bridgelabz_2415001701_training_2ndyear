import java.util.Scanner;

public class u {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();

        String str = Long.toString(num);
        int len = str.length();
        int[] digits = new int[len];
        int[] freq = new int[10];

        for (int i = 0; i < len; i++) {
            digits[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < len; i++) {
            freq[digits[i]]++;
        }

        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " times");
            }
        }
        sc.close();
    }
}
