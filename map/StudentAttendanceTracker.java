import java.util.*;

public class StudentAttendanceTracker {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        Map<String, Integer> attendance = new HashMap<>();

        // 1. Initialize attendance
        for (String s : students) attendance.put(s, 0);

        // 2. Simulate attendance for 15 days
        Random rand = new Random();
        for (int day = 1; day <= 15; day++) {
            System.out.println("Day " + day + " present: ");
            // Randomly pick students present today
            for (String s : students) {
                if (rand.nextBoolean()) {
                    attendance.put(s, attendance.get(s) + 1);
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }

        // 3. Students with <10 days attendance
        System.out.println("\nStudents with fewer than 10 days attendance:");
        for (Map.Entry<String, Integer> entry : attendance.entrySet()) {
            if (entry.getValue() < 10) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " days");
            }
        }
    }
}