import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        if (arr[0] == arr[4]) {
            System.out.println("First element and Last element are Equal");
        } else if (arr[0] > arr[4]) {
            System.out.println("First element is Greater than Last element");
        } else {
            System.out.println("First element is Less than Last element");
        }
        sc.close();
    }
}
