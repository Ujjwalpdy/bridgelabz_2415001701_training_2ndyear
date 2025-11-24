import java.util.Random;

// Custom Exceptions
class NegativeAmountException extends Exception { public NegativeAmountException(String msg){super(msg);} }
class InsufficientFundsException extends Exception { public InsufficientFundsException(String msg){super(msg);} }
class NetworkFailureException extends Exception { public NetworkFailureException(String msg){super(msg);} }

class Transaction {
    Random rand = new Random();

    public void processTransaction(int balance, int amount) throws NegativeAmountException, InsufficientFundsException, NetworkFailureException {
        int scenario = rand.nextInt(3);
        switch(scenario) {
            case 0 -> { if (amount < 0) throw new NegativeAmountException("Amount cannot be negative!"); }
            case 1 -> { if (amount > balance) throw new InsufficientFundsException("Not enough balance!"); }
            case 2 -> { throw new NetworkFailureException("Network issue! Try later."); }
        }
        System.out.println("Transaction successful!");
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Transaction t = new Transaction();
        try {
            t.processTransaction(1000, 1500);
        } catch (NegativeAmountException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println(e.getMessage());
        }
    }
}