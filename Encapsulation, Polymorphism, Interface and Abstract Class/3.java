abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() { return vehicleNumber; }
    public double getRentalRate() { return rentalRate; }

    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Car", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 500; }
    public String getInsuranceDetails() { return "Car Insurance Policy"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) { super(vehicleNumber, "Bike", rentalRate); }
    public double calculateRentalCost(int days) { return getRentalRate() * days; }
    public double calculateInsurance() { return 200; }
    public String getInsuranceDetails() { return "Bike Insurance Policy"; }
}

// Polymorphism
import java.util.ArrayList;

public class VehicleRentalApp {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("C101", 1000));
        vehicles.add(new Bike("B101", 500));

        for (Vehicle v : vehicles) {
            System.out.println(v.getVehicleNumber() + " rental cost: " + v.calculateRentalCost(5));
            if (v instanceof Insurable i) {
                System.out.println("Insurance cost: " + i.calculateInsurance());
            }
        }
    }
}
