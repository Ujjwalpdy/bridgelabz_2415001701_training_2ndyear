class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobileMain {
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone("Samsung", "S23", 79999.99);
        m.displayDetails();
    }
}
