package model;

public class Result {
    private int id;
    private int studentId;
    private int marks1;
    private int marks2;
    private int marks3;

    public Result() {}

    public Result(int id, int studentId, int marks1, int marks2, int marks3) {
        this.id = id;
        this.studentId = studentId;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getStudentId() { return studentId; }
    public void setStudentId(int studentId) { this.studentId = studentId; }

    public int getMarks1() { return marks1; }
    public void setMarks1(int marks1) { this.marks1 = marks1; }

    public int getMarks2() { return marks2; }
    public void setMarks2(int marks2) { this.marks2 = marks2; }

    public int getMarks3() { return marks3; }
    public void setMarks3(int marks3) { this.marks3 = marks3; }

    public int total() { return marks1 + marks2 + marks3; }

    @Override
    public String toString() {
        return "Result{id=" + id + ", studentId=" + studentId + ", marks=[" + marks1 + "," + marks2 + "," + marks3 + "]}";
    }
}