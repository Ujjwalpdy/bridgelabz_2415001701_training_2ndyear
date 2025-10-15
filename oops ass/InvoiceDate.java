import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateFormatter {
    static String formatDate(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class InvoiceDate {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Format 1: " + DateFormatter.formatDate(today, "dd-MM-yyyy"));
        System.out.println("Format 2: " + DateFormatter.formatDate(today, "MMMM dd, yyyy"));
    }
}
