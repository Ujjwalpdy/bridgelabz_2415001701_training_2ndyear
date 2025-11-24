abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    public void deposit(double amount) { balance += amount; }
    public void withdraw(double amount) { balance -= amount; }

    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }
    public double calculateInterest() { return getBalance() * 0.04; }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String acc, String name, double bal) { super(acc, name, bal); }
    public double calculateInterest() { return getBalance() * 0.02; }
}

// Polymorphism example
import java.util.ArrayList;

public class BankingApp {
    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.add(new SavingsAccount("S101", "Alice", 5000));
        accounts.add(new CurrentAccount("C101", "Bob", 10000));

        for (BankAccount acc : accounts) {
            System.out.println(acc.calculateInterest());
        }
    }
}
