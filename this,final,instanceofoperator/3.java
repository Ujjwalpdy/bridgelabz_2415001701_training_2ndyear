class Employee {

    // ---------- STATIC ----------
    private static String companyName = "Tech Mahindra";
    private static int totalEmployees = 0;

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // ---------- INSTANCE VARIABLES ----------
    private String name;
    private final int id;            // FINAL → cannot change after assignment
    private String designation;

    // ---------- CONSTRUCTOR USING THIS ----------
    public Employee(String name, int id, String designation) {
        this.name = name;            // resolving ambiguity
        this.id = id;                // final variable initialized here
        this.designation = designation;

        totalEmployees++;            // static counter
    }

    // ---------- METHOD TO DISPLAY DETAILS ----------
    public void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Designation: " + designation);
    }
}



// --------- MAIN CLASS FOR TESTING ----------
public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Sonu", 101, "Software Engineer");
        Employee e2 = new Employee("Aman", 102, "Data Analyst");

        // INSTANCEOF CHECK
        if (e1 instanceof Employee) {
            e1.displayDetails();
        }

        if (e2 instanceof Employee) {
            e2.displayDetails();
        }

        // STATIC METHOD
        Employee.displayTotalEmployees();
    }
}