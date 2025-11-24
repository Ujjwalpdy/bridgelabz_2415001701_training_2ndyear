import java.util.*;

public class EmployeeSalaryDirectory {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();
        salaries.put("Alice", 50000.0);
        salaries.put("Bob", 60000.0);
        salaries.put("Charlie", 55000.0);
        salaries.put("David", 70000.0);
        salaries.put("Eva", 65000.0);
        salaries.put("Frank", 48000.0);

        // Give raises
        giveRaise(salaries, "Alice", 10);
        giveRaise(salaries, "Eva", 5);
        giveRaise(salaries, "George", 7); // not found

        // Average salary
        double total = 0;
        for (double s : salaries.values()) total += s;
        System.out.println("Average salary: " + (total / salaries.size()));

        // Highest paid
        double maxSalary = Collections.max(salaries.values());
        System.out.println("Highest paid employee(s):");
        for (Map.Entry<String, Double> entry : salaries.entrySet()) {
            if (entry.getValue() == maxSalary) System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void giveRaise(Map<String, Double> salaries, String employee, double percent) {
        if (salaries.containsKey(employee)) {
            double oldSalary = salaries.get(employee);
            salaries.put(employee, oldSalary + oldSalary * percent / 100);
            System.out.println("Raised " + employee + "'s salary to " + salaries.get(employee));
        } else {
            System.out.println("Employee not found: " + employee);
        }
    }
}