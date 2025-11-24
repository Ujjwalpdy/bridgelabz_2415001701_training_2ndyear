import java.util.*;

public class InventoryManagement {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // 1. Adding products
        stock.put("Apple", 50);
        stock.put("Banana", 30);
        stock.put("Milk", 20);

        // 2. Customer buys
        sell(stock, "Apple", 10);
        sell(stock, "Milk", 25); // exceeds stock

        // 3. New shipment
        stock.put("Banana", stock.getOrDefault("Banana", 0) + 50);

        // 4. Query product
        queryProduct(stock, "Milk");
        queryProduct(stock, "Orange");

        // Print out-of-stock products
        System.out.println("Out of stock products:");
        for (Map.Entry<String, Integer> entry : stock.entrySet()) {
            if (entry.getValue() == 0) System.out.println(entry.getKey());
        }
    }

    static void sell(Map<String, Integer> stock, String product, int qty) {
        int available = stock.getOrDefault(product, 0);
        if (available >= qty) {
            stock.put(product, available - qty);
        } else {
            stock.put(product, 0); // out of stock
            System.out.println(product + " is out of stock now!");
        }
    }

    static void queryProduct(Map<String, Integer> stock, String product) {
        if (stock.containsKey(product)) {
            System.out.println(product + " remaining: " + stock.get(product));
        } else {
            System.out.println(product + " not stocked");
        }
    }
}