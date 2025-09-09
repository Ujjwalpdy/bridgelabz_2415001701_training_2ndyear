import java.util.Random;

public class BonusCalculator {

    static final int EMPLOYEES = 10;

    // Method to generate salary (5-digit) and years of service
    public static int[][] generateData() {
        Random rand = new Random();
        int[][] data = new int[EMPLOYEES][2]; // [i][0] = salary, [i][1] = years
        for (int i = 0; i < EMPLOYEES; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(15); // years between 1 and 15
        }
        return data;
    }

    // Method to calculate new salary & bonus
    public static int[][] calculateBonus(int[][] data) {
        int[][] result = new int[EMPLOYEES][3]; // [salary, bonus, new salary]
        for (int i = 0; i < EMPLOYEES; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double rate = (years > 5) ? 0.05 : 0.02;
            int bonus = (int) (salary * rate);
            int newSalary = salary + bonus;
            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method to display in table format
    public static void displayTable(int[][] data, int[][] result) {
        int sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n",
                "EmpID", "Salary", "Years", "Bonus", "NewSalary", "TotalBonus");

        for (int i = 0; i < EMPLOYEES; i++) {
            int salary = result[i][0];
            int bonus = result[i][1];
            int newSalary = result[i][2];
            int years = data[i][1];

            sumOld += salary;
            sumNew += newSalary;
            sumBonus += bonus;

            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10d%n",
                    (i + 1), salary, years, bonus, newSalary, bonus);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("%-10s %-10d %-10s %-10d %-10d %-10d%n",
                "TOTAL", sumOld, "", sumBonus, sumNew, sumBonus);
    }

    public static void main(String[] args) {
        int[][] data = generateData();
        int[][] result = calculateBonus(data);
        displayTable(data, result);
    }
}
