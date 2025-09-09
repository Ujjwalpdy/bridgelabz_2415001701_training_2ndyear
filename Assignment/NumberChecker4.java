import java.util.Arrays;

public class NumberChecker4 {

    public static int countDigits(int n) {
        return String.valueOf(Math.abs(n)).length();
    }

    public static int[] digits(int n) {
        String s = String.valueOf(Math.abs(n));
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++) arr[i] = s.charAt(i) - '0';
        return arr;
    }

    public static int[] reverseDigits(int n) {
        int[] d = digits(n);
        int[] r = new int[d.length];
        for (int i = 0; i < d.length; i++) r[i] = d[d.length - 1 - i];
        return r;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int n) {
        return Arrays.equals(digits(n), reverseDigits(n));
    }

    public static boolean isDuckNumber(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && !s.startsWith("0");
    }

    public static void main(String[] args) {
        int n = 121;
        System.out.println("Digits: " + Arrays.toString(digits(n)));
        System.out.println("Reverse: " + Arrays.toString(reverseDigits(n)));
        System.out.println("Palindrome? " + isPalindrome(n));
        System.out.println("Duck Number? " + isDuckNumber(n));
    }
}
