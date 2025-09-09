public class NumberChecker6 {

    private static int sumDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) sum += i;
        return n == 1 ? 0 : sum;
    }

    public static boolean isPerfect(int n) {
        return sumDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumDivisors(n) < n;
    }

    private static int fact(int x) {
        int f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int sum = 0, temp = n;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int n = 28;
        System.out.println("Perfect? " + isPerfect(n));
        System.out.println("Abundant? " + isAbundant(n));
        System.out.println("Deficient? " + isDeficient(n));
        System.out.println("Strong? " + isStrong(n));
    }
}
