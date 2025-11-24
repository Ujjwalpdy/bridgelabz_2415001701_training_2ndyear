class Bank {
    String bankName;

    Bank(String bankName) {
        this.bankName = bankName;
    }

    void openAccount(Customer customer, double initialAmount) {
        customer.balance = initialAmount;       // communication
        System.out.println(customer.name + " opened an account in " + bankName +
                           " with balance ₹" + initialAmount);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance = ₹" + balance);
    }
}

public class AssociationDemo {
    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");
        Customer c1 = new Customer("Sonu");
        Customer c2 = new Customer("Aman");

        bank.openAccount(c1, 5000);
        bank.openAccount(c2, 8000);

        c1.viewBalance();
        c2.viewBalance();
    }
}