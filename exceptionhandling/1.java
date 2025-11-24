// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM Class
class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }
}

// Main
public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);

        try {
            atm.withdraw(12000); // try to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// ATM Class
class ATM {
    private int balance;

    public ATM(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance! Available: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: ₹" + balance);
    }
}

// Main
public class ATMApp {
    public static void main(String[] args) {
        ATM atm = new ATM(10000);

        try {
            atm.withdraw(12000); // try to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}