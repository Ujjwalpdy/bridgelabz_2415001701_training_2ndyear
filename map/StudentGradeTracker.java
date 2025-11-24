import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Map<String, Double> grades = new TreeMap<>(); // TreeMap sorts by key

        // 1. Adding students
        grades.put("Alice", 85.0);
        grades.put("Bob", 78.5);
        grades.put("Charlie", 92.0);

        // 2. Updating grade
        grades.put("Bob", 82.0); // Bob retook test

        // 3. Removing student
        grades.remove("Alice"); // Alice dropped out

        // 4. Iterating and printing
        System.out.println("Students and grades:");
        for (Map.Entry<String, Double> entry : grades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}