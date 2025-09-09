public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = Character.getNumericValue(s.charAt(i));
        }
        return digits;
    }

    public static boolean isDuckNumber(int num) {
        String s = String.valueOf(num);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static boolean isArmstrong(int num) {
        int[] digits = storeDigits(num);
        int n = digits.length, sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == num;
    }

    public static int findLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int n : arr) if (n > max) max = n;
        return max;
    }

    public static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                secondMax = max;
                max = n;
            } else if (n > secondMax && n != max) {
                secondMax = n;
            }
        }
        return secondMax;
    }

    public static int findSmallest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int n : arr) if (n < min) min = n;
        return min;
    }

    public static int findSecondSmallest(int[] arr) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                secondMin = min;
                min = n;
            } else if (n < secondMin && n != min) {
                secondMin = n;
            }
        }
        return secondMin;
    }

    public static void main(String[] args) {
        int number = 153; // Example number
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits count: " + countDigits(number));
        System.out.println("Duck number? " + isDuckNumber(number));
        System.out.println("Armstrong number? " + isArmstrong(number));
        System.out.println("Largest digit: " + findLargest(digits));
        System.out.println("Second largest digit: " + findSecondLargest(digits));
        System.out.println("Smallest digit: " + findSmallest(digits));
        System.out.println("Second smallest digit: " + findSecondSmallest(digits));
    }
}
