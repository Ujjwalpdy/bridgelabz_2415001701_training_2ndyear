package service;

import db.DatabaseManager;
import model.Student;
import model.Result;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    // In-memory collection (ArrayList) as required
    private List<Student> studentsCache = new ArrayList<>();

    public StudentService() {
        loadAllStudentsToCache();
    }

    private void loadAllStudentsToCache() {
        studentsCache.clear();
        String sql = "SELECT id, name, course FROM students";
        try (Connection conn = DatabaseManager.getConnection();
             Statement st = conn.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                studentsCache.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("course")));
            }
        } catch (SQLException e) {
            System.err.println("Error loading students: " + e.getMessage());
        }
    }

    // CREATE student (both DB and cache)
    public boolean addStudent(Student s) {
        String sql = "INSERT INTO students (id, name, course) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, s.getId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getCourse());
            int res = ps.executeUpdate();
            if (res > 0) {
                studentsCache.add(s);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error adding student: " + e.getMessage());
        }
        return false;
    }

    // READ all students from cache
    public List<Student> getAllStudents() {
        return new ArrayList<>(studentsCache);
    }

    public Student getStudentById(int id) {
        return studentsCache.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }

    // UPDATE student (DB + cache)
    public boolean updateStudent(Student s) {
        String sql = "UPDATE students SET name = ?, course = ? WHERE id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, s.getName());
            ps.setString(2, s.getCourse());
            ps.setInt(3, s.getId());
            int res = ps.executeUpdate();
            if (res > 0) {
                // update cache
                for (int i = 0; i < studentsCache.size(); i++) {
                    if (studentsCache.get(i).getId() == s.getId()) {
                        studentsCache.set(i, s);
                        break;
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error updating student: " + e.getMessage());
        }
        return false;
    }

    // DELETE student (DB + cache)
    public boolean deleteStudent(int id) {
        String sql = "DELETE FROM students WHERE id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            int res = ps.executeUpdate();
            if (res > 0) {
                studentsCache.removeIf(s -> s.getId() == id);
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error deleting student: " + e.getMessage());
        }
        return false;
    }

    // CRUD for Result
    public boolean addResult(Result r) {
        String sql = "INSERT INTO results (student_id, marks1, marks2, marks3) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            ps.setInt(1, r.getStudentId());
            ps.setInt(2, r.getMarks1());
            ps.setInt(3, r.getMarks2());
            ps.setInt(4, r.getMarks3());
            int res = ps.executeUpdate();
            if (res > 0) {
                try (ResultSet keys = ps.getGeneratedKeys()) {
                    if (keys.next()) {
                        r.setId(keys.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error adding result: " + e.getMessage());
        }
        return false;
    }

    public List<Result> getResultsForStudent(int studentId) {
        List<Result> list = new ArrayList<>();
        String sql = "SELECT id, student_id, marks1, marks2, marks3 FROM results WHERE student_id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, studentId);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(new Result(rs.getInt("id"), rs.getInt("student_id"),
                            rs.getInt("marks1"), rs.getInt("marks2"), rs.getInt("marks3")));
                }
            }
        } catch (SQLException e) {
            System.err.println("Error fetching results: " + e.getMessage());
        }
        return list;
    }

    public boolean updateResult(Result r) {
        String sql = "UPDATE results SET marks1 = ?, marks2 = ?, marks3 = ? WHERE id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, r.getMarks1());
            ps.setInt(2, r.getMarks2());
            ps.setInt(3, r.getMarks3());
            ps.setInt(4, r.getId());
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error updating result: " + e.getMessage());
        }
        return false;
    }

    public boolean deleteResult(int resultId) {
        String sql = "DELETE FROM results WHERE id = ?";
        try (Connection conn = DatabaseManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, resultId);
            return ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting result: " + e.getMessage());
        }
    }
}