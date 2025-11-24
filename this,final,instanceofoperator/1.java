public class BankAccount {

    // ---------- STATIC ----------
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // ---------- INSTANCE VARIABLES ----------
    private String accountHolderName;
    private final long accountNumber;   // FINAL → cannot change once given
    private double balance;

    // ---------- CONSTRUCTOR USING THIS ----------
    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;  // this resolves ambiguity
        this.accountNumber = accountNumber;          // final variable initialized here
        this.balance = balance;

        totalAccounts++;   // static counter
    }

    // ---------- METHODS ----------
    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited. New Balance = " + balance);
    }

    // Withdraw
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance = " + balance);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}



// ---------- MAIN CLASS TO TEST EVERYTHING ----------
public class Main {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Sonu", 12345678901L, 5000);
        BankAccount acc2 = new BankAccount("Aman", 98765432101L, 8000);

        // INSTANCEOF CHECK
        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        // Deposit & Withdraw
        acc1.deposit(2000);
        acc1.withdraw(3000);

        // STATIC METHOD
        System.out.println("\nTotal Accounts Created: " + BankAccount.getTotalAccounts());
    }
} {
    
}
