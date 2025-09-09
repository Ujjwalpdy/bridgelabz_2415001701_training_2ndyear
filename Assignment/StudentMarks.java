import java.util.Random;
import java.util.Scanner;

public class StudentMarks {

    // Generate random 2-digit scores for Physics, Chemistry, Math
    public static int[][] generateScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3]; // PCM
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + rand.nextInt(90); // random 2-digit marks
            }
        }
        return scores;
    }

    // Calculate total, average, percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        int n = scores.length;
        double[][] results = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double perc = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(perc * 100.0) / 100.0;
        }
        return results;
    }

    // Display in table format
    public static void display(int[][] scores, double[][] results) {
        System.out.printf("%-6s %-8s %-8s %-8s %-8s %-8s %-8s%n",
                "ID", "Physics", "Chem", "Math", "Total", "Average", "Percent");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-6d %-8d %-8d %-8d %-8.0f %-8.2f %-8.2f%n",
                    (i + 1),
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        display(scores, results);
    }
}
