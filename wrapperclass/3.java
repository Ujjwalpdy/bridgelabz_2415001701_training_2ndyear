public class UserValidation {
    public static boolean isValidAge(String ageStr) {
        try {
            int age = Integer.parseInt(ageStr);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false; // invalid integer input
        }
    }

    public static void main(String[] args) {
        String[] testAges = {"20", "17", "abc", "18"};

        for (String age : testAges) {
            System.out.println(age + ": " + isValidAge(age));
        }
    }
}
