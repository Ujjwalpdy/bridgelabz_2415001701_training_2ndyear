import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][3]; // weight, height(cm), BMI
        String[] status = new String[10];

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            double heightMeter = data[i][1] / 100.0; // convert cm → meter
            data[i][2] = data[i][0] / (heightMeter * heightMeter); // BMI

            status[i] = getBMIStatus(data[i][2]);
        }

        // Display
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f\t\t%.1f\t\t%.2f\t%s\n", data[i][1], data[i][0], data[i][2], status[i]);
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 40) return "Overweight";
        else return "Obese";
    }
}
