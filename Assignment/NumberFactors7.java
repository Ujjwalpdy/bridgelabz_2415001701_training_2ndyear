import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberFactors7 {

    public static int[] factors(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            if (n % i == 0) list.add(i);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int greatestFactor(int n) {
        int[] f = factors(n);
        return f[f.length - 1];
    }

    public static int sumOfFactors(int n) {
        int sum = 0;
        for (int f : factors(n)) sum += f;
        return sum;
    }

    public static long productOfFactors(int n) {
        long prod = 1;
        for (int f : factors(n)) prod *= f;
        return prod;
    }

    public static long productOfCubeOfFactors(int n) {
        long prod = 1;
        for (int f : factors(n)) prod *= Math.pow(f, 3);
        return prod;
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println("Factors: " + Arrays.toString(factors(n)));
        System.out.println("Greatest Factor: " + greatestFactor(n));
        System.out.println("Sum of Factors: " + sumOfFactors(n));
        System.out.println("Product of Factors: " + productOfFactors(n));
        System.out.println("Product of Cubes of Factors: " + productOfCubeOfFactors(n));
    }
}
