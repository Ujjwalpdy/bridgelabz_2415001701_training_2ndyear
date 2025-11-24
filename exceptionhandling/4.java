import java.util.Random;

// Custom Exceptions
class OutOfStockException extends Exception {
    public OutOfStockException(String message) { super(message); }
}
class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) { super(message); }
}

class OrderSystem {
    Random rand = new Random();

    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        int scenario = rand.nextInt(3); // 0,1,2
        if (scenario == 0) throw new OutOfStockException("Product is out of stock!");
        else if (scenario == 1) throw new PaymentFailedException("Payment failed! Try again.");
        else System.out.println("Order placed successfully!");
    }
}

// Main
public class OnlineOrderApp {
    public static void main(String[] args) {
        OrderSystem order = new OrderSystem();
        try {
            order.placeOrder();
        } catch (OutOfStockException | PaymentFailedException e) {
            System.out.println(e.getMessage());
        }
    }
}
