import java.util.Scanner;

public class NumberCheck1 {
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        else if (a == b) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // Input
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        // Check each number
        for (int num : arr) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        // Compare first and last element
        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and last numbers are Equal");
        else if (result > 0) System.out.println("First number is Greater than last number");
        else System.out.println("First number is Less than last number");
    }
}
