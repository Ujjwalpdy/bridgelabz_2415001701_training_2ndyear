import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();

        String message = "This is a test message.";
        int length = getLength.apply(message);

        if (length > 20) {
            System.out.println("Message exceeds character limit. Length: " + length);
        } else {
            System.out.println("Message is within limit. Length: " + length);
        }
    }
}
