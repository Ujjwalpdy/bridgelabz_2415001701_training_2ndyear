class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        int i = 0, j = text.length() - 1;

        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome())
            System.out.println("Result: It is a palindrome");
        else
            System.out.println("Result: Not a palindrome");
    }
}

public class PalindromeMain {
    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.displayResult();
    }
}
