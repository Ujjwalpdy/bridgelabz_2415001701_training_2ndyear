public class GradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85"};

        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade);
                System.out.println("Valid grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}