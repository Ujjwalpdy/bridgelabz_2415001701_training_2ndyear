class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(int acc, double bal, int limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int duration;

    FixedDepositAccount(int acc, double bal, int duration) {
        super(acc, bal);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account");
    }
}

public class Main {
    public static void main(String[] args) {
        new SavingsAccount(1, 2000, 5.5).displayAccountType();
    }
}
