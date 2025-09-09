public class NumberCheckerExtended {
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

    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static boolean isHarshad(int num) {
        int[] digits = storeDigits(num);
        int sum = sumDigits(digits);
        return num % sum == 0;
    }

    public static int[][] digitFrequency(int num) {
        int[] digits = storeDigits(num);
        int[][] freq = new int[10][2]; // digit | frequency

        for (int d : digits) freq[d][1]++;

        for (int i = 0; i < 10; i++) freq[i][0] = i;

        return freq;
    }

    public static void main(String[] args) {
        int number = 126; // Example
        int[] digits = storeDigits(number);

        System.out.println("Number: " + number);
        System.out.println("Digits count: " + countDigits(number));
        System.out.println("Sum of digits: " + sumDigits(digits));
        System.out.println("Harshad number? " + isHarshad(number));

        int[][] freq = digitFrequency(number);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0)
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
        }
    }
}
