import java.util.Scanner;

public class Q2_SubstringCharAt {
    
    // Manual substring using charAt()
    public static String manualSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manual = manualSubstring(text, start, end);
        String builtin = text.substring(start, end);

        System.out.println("Manual substring: " + manual);
        System.out.println("Built-in substring(): " + builtin);
        System.out.println("Both same? " + manual.equals(builtin));
    }
}