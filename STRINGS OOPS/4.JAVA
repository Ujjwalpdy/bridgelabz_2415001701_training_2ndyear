public class Q4_NullPointerDemo {

    // Method that generates NullPointerException
    public static void generateNPE() {
        String text = null;
        System.out.println(text.length());  // NPE happens here
    }

    // Method that handles NullPointerException
    public static void handleNPE() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled!");
        }
    }

    public static void main(String[] args) {

        // First generate exception
        try {
            generateNPE();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e);
        }

        // Now handle exception properly
        handleNPE();
    }
}