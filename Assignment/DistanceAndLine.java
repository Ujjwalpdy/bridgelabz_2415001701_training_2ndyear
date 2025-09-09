import java.util.Scanner;

public class DistanceAndLine {

    // Euclidean distance between 2 points
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Equation of line from 2 points -> return [slope m, intercept b]
    public static double[] lineEquation(int x1, int y1, int x2, int y2) {
        double m = (double) (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1; // y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();

        double d = distance(x1, y1, x2, y2);
        double[] line = lineEquation(x1, y1, x2, y2);

        System.out.println("Distance = " + d);
        System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
    }
}
