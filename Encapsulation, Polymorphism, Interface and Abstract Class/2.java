// Abstract Product class
abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public String getName() { return name; }

    public abstract double calculateDiscount();
}

// Interface for taxable products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Subclasses
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.10; }
    public double calculateTax() { return getPrice() * 0.18; }
    public String getTaxDetails() { return "GST 18%"; }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return getPrice() * 0.15; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }
    public double calculateDiscount() { return 0; }
}

// Polymorphism example
import java.util.List;

public class ECommerceApp {
    public static void printFinalPrice(List<Product> products) {
        for (Product p : products) {
            double finalPrice = p.getPrice() - p.calculateDiscount();
            if (p instanceof Taxable t) finalPrice += t.calculateTax();
            System.out.println(p.getName() + " final price: " + finalPrice);
        }
    }
}
