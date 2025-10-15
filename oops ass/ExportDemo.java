interface DataExporter {
    void exportToCSV();
    void exportToPDF();
    default void exportToJSON() {
        System.out.println("Exporting data to JSON (default).");
    }
}

class ReportExporter implements DataExporter {
    public void exportToCSV() {
        System.out.println("Exporting data to CSV...");
    }
    public void exportToPDF() {
        System.out.println("Exporting data to PDF...");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        ReportExporter report = new ReportExporter();
        report.exportToCSV();
        report.exportToPDF();
        report.exportToJSON();
    }
}
