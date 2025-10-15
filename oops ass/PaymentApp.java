interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default).");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed payment of ₹" + amount + " via PayPal.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPal();
        paypal.processPayment(1500);
        paypal.refund(500);
    }
}
