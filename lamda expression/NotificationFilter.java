import java.util.*;
import java.util.function.Predicate;

public class NotificationFilter {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList(
            "Blood pressure high",
            "Appointment tomorrow",
            "New test results",
            "Medication reminder"
        );

        // User wants only alerts containing 'reminder'
        Predicate<String> reminderFilter = alert -> alert.toLowerCase().contains("reminder");

        List<String> filteredAlerts = new ArrayList<>();
        for (String alert : alerts) {
            if (reminderFilter.test(alert)) {
                filteredAlerts.add(alert);
            }
        }

        System.out.println("Filtered Alerts: " + filteredAlerts);
    }
}
