class Student {

    // ---------- STATIC ----------
    private static String universityName = "Delhi University";
    private static int totalStudents = 0;

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    // ---------- INSTANCE VARIABLES ----------
    private String name;
    private final int rollNumber;   // FINAL → cannot be changed
    private String grade;

    // ---------- CONSTRUCTOR USING THIS ----------
    public Student(String name, int rollNumber, String grade) {
        this.name = name;               // this resolves ambiguity
        this.rollNumber = rollNumber;   // final variable initialized
        this.grade = grade;

        totalStudents++;                // static count
    }

    // ---------- METHOD TO DISPLAY DETAILS ----------
    public void displayStudentDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    // ---------- METHOD TO UPDATE GRADE ----------
    public void updateGrade(String newGrade) {
        this.grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }
}



// ---------- MAIN CLASS FOR TESTING ----------
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Sonu", 11, "A");
        Student student2 = new Student("Aman", 12, "B");

        // INSTANCEOF CHECK before operations
        if (student1 instanceof Student) {
            student1.displayStudentDetails();
        }

        if (student2 instanceof Student) {
            student2.displayStudentDetails();
        }

        // Updating grade safely using instanceof
        if (student1 instanceof Student) {
            student1.updateGrade("A+");
        }

        // Show total enrolled students
        Student.displayTotalStudents();
    }
}
