# Student Result Management System

**Database name:** Student  
**Table structure:** Two tables (students, results)

## Requirements
- Java 11 (or later)
- MySQL server
- MySQL Connector/J (add jar to `lib/` or classpath)

## Setup

1. Start MySQL server and create the database:
```sql
CREATE DATABASE IF NOT EXISTS Student;
USE Student;
```

2. The application will auto-create tables if missing when you run `Main`.

3. Update database credentials in `src/db/DatabaseManager.java`:
```java
private static final String USER = "root";
private static final String PASS = ""; // set your password
```

4. Compile & Run (example using command line):
```bash
# from project root
javac -d out -cp "lib/mysql-connector-java.jar" src/db/DatabaseManager.java src/model/*.java src/service/*.java src/Main.java
java -cp "out:lib/mysql-connector-java.jar" Main
```

On Windows replace `:` with `;` in classpath.

## Notes
- The app uses an in-memory `ArrayList` cache for students as well as persistent storage (MySQL).
- Exception handling is basic; extend as needed.
- Add `mysql-connector-java` jar into `lib/` directory or to your IDE project classpath.