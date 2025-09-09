import java.util.Random;
import java.util.Scanner;

public class Matrix2 {

    // Create random matrix
    public static int[][] createMatrix(int n, int m) {
        Random rand = new Random();
        int[][] M = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                M[i][j] = rand.nextInt(10);
        return M;
    }

    // Transpose
    public static int[][] transpose(int[][] M) {
        int r = M.length, c = M[0].length;
        int[][] T = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                T[j][i] = M[i][j];
        return T;
    }

    // Determinant of 2x2
    public static int determinant2x2(int[][] M) {
        return M[0][0] * M[1][1] - M[0][1] * M[1][0];
    }

    // Determinant of 3x3
    public static int determinant3x3(int[][] M) {
        return M[0][0] * (M[1][1] * M[2][2] - M[1][2] * M[2][1])
             - M[0][1] * (M[1][0] * M[2][2] - M[1][2] * M[2][0])
             + M[0][2] * (M[1][0] * M[2][1] - M[1][1] * M[2][0]);
    }

    // Inverse of 2x2
    public static double[][] inverse2x2(int[][] M) {
        int det = determinant2x2(M);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");
        double[][] inv = new double[2][2];
        inv[0][0] = M[1][1] / (double) det;
        inv[1][1] = M[0][0] / (double) det;
        inv[0][1] = -M[0][1] / (double) det;
        inv[1][0] = -M[1][0] / (double) det;
        return inv;
    }

    // Inverse of 3x3 using adjoint method
    public static double[][] inverse3x3(int[][] M) {
        int det = determinant3x3(M);
        if (det == 0) throw new ArithmeticException("Matrix not invertible");

        double[][] adj = new double[3][3];
        adj[0][0] = (M[1][1] * M[2][2] - M[1][2] * M[2][1]);
        adj[0][1] = -(M[1][0] * M[2][2] - M[1][2] * M[2][0]);
        adj[0][2] = (M[1][0] * M[2][1] - M[1][1] * M[2][0]);

        adj[1][0] = -(M[0][1] * M[2][2] - M[0][2] * M[2][1]);
        adj[1][1] = (M[0][0] * M[2][2] - M[0][2] * M[2][0]);
        adj[1][2] = -(M[0][0] * M[2][1] - M[0][1] * M[2][0]);

        adj[2][0] = (M[0][1] * M[1][2] - M[0][2] * M[1][1]);
        adj[2][1] = -(M[0][0] * M[1][2] - M[0][2] * M[1][0]);
        adj[2][2] = (M[0][0] * M[1][1] - M[0][1] * M[1][0]);

        double[][] inv = new double[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                inv[i][j] = adj[i][j] / (double) det;

        return inv;
    }

    // Display matrix
    public static void display(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    // Display double matrix
    public static void display(double[][] M) {
        for (double[] row : M) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] M2 = {{4, 7}, {2, 6}};
        int[][] M3 = {{1, 2, 3}, {0, 1, 4}, {5, 6, 0}};

        System.out.println("Matrix 2x2:");
        display(M2);
        System.out.println("Determinant: " + determinant2x2(M2));
        System.out.println("Inverse:");
        display(inverse2x2(M2));

        System.out.println("\nMatrix 3x3:");
        display(M3);
        System.out.println("Determinant: " + determinant3x3(M3));
        System.out.println("Inverse:");
        display(inverse3x3(M3));
    }
}
