package db;

import java.sql.*;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/Student?useSSL=false&allowPublicKeyRetrieval=true";
    private static final String USER = "root";
    private static final String PASS = ""; // <-- Update your MySQL password here

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found. Add connector to classpath.");
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }

    // Utility to create tables if they don't exist (run once)
    public static void initDatabase() {
        String createStudents = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT PRIMARY KEY," +
                "name VARCHAR(100) NOT NULL," +
                "course VARCHAR(100) NOT NULL" +
                ")";
        String createResults = "CREATE TABLE IF NOT EXISTS results (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "student_id INT NOT NULL," +
                "marks1 INT," +
                "marks2 INT," +
                "marks3 INT," +
                "FOREIGN KEY (student_id) REFERENCES students(id) ON DELETE CASCADE" +
                ")";
        try (Connection conn = getConnection();
             Statement stmt = conn.createStatement()) {
            stmt.execute(createStudents);
            stmt.execute(createResults);
        } catch (SQLException e) {
            System.err.println("Error initializing database: " + e.getMessage());
        }
    }
}