class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1000; // fixed price for example

    // Default constructor
    CarRental() {
        customerName = "Unknown";
        carModel = "Basic Model";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double totalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + totalCost());
    }
}

public class CarRentalMain {
    public static void main(String[] args) {
        CarRental c = new CarRental("Aman", "Honda City", 4);
        c.display();
    }
}