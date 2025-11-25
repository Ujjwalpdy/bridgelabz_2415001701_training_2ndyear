import db.DatabaseManager;
import model.Result;
import model.Student;
import service.StudentService;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static StudentService service = new StudentService();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Student Result Management System");
        DatabaseManager.initDatabase();
        menuLoop();
    }

    private static void menuLoop() {
        while (true) {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Add Result for Student");
            System.out.println("6. View Results for Student");
            System.out.println("7. Update Result");
            System.out.println("8. Delete Result");
            System.out.println("9. Exit");
            System.out.print("Choose: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: addStudent(); break;
                case 2: listStudents(); break;
                case 3: updateStudent(); break;
                case 4: deleteStudent(); break;
                case 5: addResult(); break;
                case 6: viewResults(); break;
                case 7: updateResult(); break;
                case 8: deleteResult(); break;
                case 9: System.out.println("Bye"); return;
                default: System.out.println("Invalid");
            }
        }
    }

    private static void addStudent() {
        try {
            System.out.print("ID: "); int id = Integer.parseInt(sc.nextLine());
            System.out.print("Name: "); String name = sc.nextLine();
            System.out.print("Course: "); String course = sc.nextLine();
            Student s = new Student(id, name, course);
            boolean ok = service.addStudent(s);
            System.out.println(ok ? "Student added." : "Failed to add student.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void listStudents() {
        List<Student> list = service.getAllStudents();
        if (list.isEmpty()) System.out.println("No students.");
        else list.forEach(System.out::println);
    }

    private static void updateStudent() {
        try {
            System.out.print("ID to update: "); int id = Integer.parseInt(sc.nextLine());
            Student s = service.getStudentById(id);
            if (s == null) { System.out.println("Not found"); return; }
            System.out.print("New name: "); s.setName(sc.nextLine());
            System.out.print("New course: "); s.setCourse(sc.nextLine());
            boolean ok = service.updateStudent(s);
            System.out.println(ok ? "Updated." : "Update failed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void deleteStudent() {
        try {
            System.out.print("ID to delete: "); int id = Integer.parseInt(sc.nextLine());
            boolean ok = service.deleteStudent(id);
            System.out.println(ok ? "Deleted." : "Delete failed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void addResult() {
        try {
            System.out.print("Student ID: "); int sid = Integer.parseInt(sc.nextLine());
            System.out.print("Marks1: "); int m1 = Integer.parseInt(sc.nextLine());
            System.out.print("Marks2: "); int m2 = Integer.parseInt(sc.nextLine());
            System.out.print("Marks3: "); int m3 = Integer.parseInt(sc.nextLine());
            Result r = new Result(0, sid, m1, m2, m3);
            boolean ok = service.addResult(r);
            System.out.println(ok ? "Result added id=" + r.getId() : "Failed to add result.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void viewResults() {
        try {
            System.out.print("Student ID: "); int sid = Integer.parseInt(sc.nextLine());
            List<Result> list = service.getResultsForStudent(sid);
            if (list.isEmpty()) System.out.println("No results.");
            else list.forEach(System.out::println);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void updateResult() {
        try {
            System.out.print("Result ID: "); int id = Integer.parseInt(sc.nextLine());
            System.out.print("Marks1: "); int m1 = Integer.parseInt(sc.nextLine());
            System.out.print("Marks2: "); int m2 = Integer.parseInt(sc.nextLine());
            System.out.print("Marks3: "); int m3 = Integer.parseInt(sc.nextLine());
            Result r = new Result(id, 0, m1, m2, m3);
            boolean ok = service.updateResult(r);
            System.out.println(ok ? "Result updated." : "Update failed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void deleteResult() {
        try {
            System.out.print("Result ID: "); int id = Integer.parseInt(sc.nextLine());
            boolean ok = service.deleteResult(id);
            System.out.println(ok ? "Deleted." : "Delete failed.");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}