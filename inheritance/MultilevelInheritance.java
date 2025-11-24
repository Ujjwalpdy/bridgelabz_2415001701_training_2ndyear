class Order {
    int orderId;
    String orderDate;

    Order(int id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class Main {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "10 Nov", "TRK123", "15 Nov");
        System.out.println(d.getOrderStatus());
    }
}
