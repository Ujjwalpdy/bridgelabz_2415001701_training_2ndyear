import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }
        int even = 0, odd = 0;
        for (int n : nums) {
            if (n % 2 == 0) even++;
            else odd++;
        }
        System.out.println("Even numbers: " + even + ", Odd numbers: " + odd);
        sc.close();
    }
}