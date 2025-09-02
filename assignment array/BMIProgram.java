import java.util.Scanner;

public class BMIProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            double weight, height;
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);

            do {
                height = sc.nextDouble();
            } while (height <= 0);

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ": Weight = " + personData[i][0] +
                               ", Height = " + personData[i][1] +
                               ", BMI = " + String.format("%.2f", personData[i][2]) +
                               ", Status = " + weightStatus[i]);
        }

        sc.close();
    }
}
