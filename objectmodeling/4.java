import java.util.ArrayList;

// -------------------- COURSE CLASS --------------------
class Course {
    String courseName;
    ArrayList<Student> enrolledStudents = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    void showEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + courseName + ":");
        for (Student s : enrolledStudents) {
            System.out.println("- " + s.name);
        }
    }
}


// -------------------- STUDENT CLASS --------------------
class Student {
    String name;
    ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollInCourse(Course course) {
        courses.add(course);        // Student → joins course
        course.enrollStudent(this); // Course → adds student
    }

    void showCourses() {
        System.out.println("\nCourses enrolled by " + name + ":");
        for (Course c : courses) {
            System.out.println("- " + c.courseName);
        }
    }
}


// -------------------- SCHOOL CLASS (Aggregation) --------------------
class School {
    String schoolName;
    ArrayList<Student> students = new ArrayList<>(); // Aggregation

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student); // School aggregates students
    }

    void showStudents() {
        System.out.println("\nStudents in " + schoolName + ":");
        for (Student s : students) {
            System.out.println("- " + s.name);
        }
    }
}


// -------------------- MAIN CLASS --------------------
public class Main {
    public static void main(String[] args) {

        // SCHOOL (Aggregation)
        School school = new School("Green Valley School");

        // STUDENTS (exist independently)
        Student s1 = new Student("Sonu");
        Student s2 = new Student("Aman");

        school.addStudent(s1);
        school.addStudent(s2);

        // COURSES (Association - many-to-many)
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");
        Course c3 = new Course("Computer");

        // Students enrolling in multiple courses
        s1.enrollInCourse(c1);
        s1.enrollInCourse(c3);

        s2.enrollInCourse(c1);
        s2.enrollInCourse(c2);
        s2.enrollInCourse(c3);

        // Display School Students (Aggregation)
        school.showStudents();

        // Show courses each student is enrolled in
        s1.showCourses();
        s2.showCourses();

        // Show students in each course
        c1.showEnrolledStudents();
        c2.showEnrolledStudents();
        c3.showEnrolledStudents();
    }
}
