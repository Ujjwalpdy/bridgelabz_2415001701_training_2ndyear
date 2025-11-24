import java.util.*;

public class CourseRegistration {
    public static void main(String[] args) {
        Map<String, Integer> courses = new HashMap<>();
        courses.put("CS101", 48);
        courses.put("CS102", 52);
        courses.put("CS103", 4);
        courses.put("CS104", 25);
        courses.put("CS105", 0);

        // Simulate student adds/drops
        updateRegistration(courses, "CS101", 3); // add 3
        updateRegistration(courses, "CS103", -2); // drop 2
        updateRegistration(courses, "CS105", 10); // add 10

        // Print near-full (>=50) and under-subscribed (<5)
        System.out.println("Near-full courses (>=50):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() >= 50) System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nUnder-subscribed courses (<5):");
        for (Map.Entry<String, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 5) System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    static void updateRegistration(Map<String, Integer> courses, String course, int change) {
        int current = courses.getOrDefault(course, 0);
        int updated = current + change;
        if (updated < 0) updated = 0;
        courses.put(course, updated);
    }
}