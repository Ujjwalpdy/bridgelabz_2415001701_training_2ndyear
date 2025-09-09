import java.util.Random;
import java.util.Scanner;

public class Matrix1 {

    // Create random matrix with rows and cols
    public static int[][] createMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = rand.nextInt(10); // values 0–9
            }
        }
        return mat;
    }

    // Add matrices
    public static int[][] add(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    // Subtract matrices
    public static int[][] subtract(int[][] A, int[][] B) {
        int rows = A.length, cols = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    // Multiply matrices
    public static int[][] multiply(int[][] A, int[][] B) {
        int rows = A.length, cols = B[0].length, common = A[0].length;
        int[][] C = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }

    // Display matrix
    public static void display(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and cols of matrix: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] A = createMatrix(r, c);
        int[][] B = createMatrix(r, c);

        System.out.println("Matrix A:");
        display(A);
        System.out.println("Matrix B:");
        display(B);

        System.out.println("A + B:");
        display(add(A, B));

        System.out.println("A - B:");
        display(subtract(A, B));

        if (r == c) { // square matrix check for multiplication
            System.out.println("A x B:");
            display(multiply(A, B));
        } else {
            System.out.println("Multiplication not possible (dimension mismatch).");
        }
    }
}
