// Custom Exception
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class LoginSystem {
    private final String validUser = "admin";
    private final String validPass = "1234";

    public void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals(validUser) || !pass.equals(validPass)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        }
        System.out.println("Login successful!");
    }
}

// Main
public class LoginApp {
    public static void main(String[] args) {
        LoginSystem login = new LoginSystem();

        try {
            login.validate("admin", "wrongpass");
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}
