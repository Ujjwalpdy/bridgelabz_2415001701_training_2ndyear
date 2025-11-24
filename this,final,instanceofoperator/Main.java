class Vehicle {

    // ---------- STATIC ----------
    private static double registrationFee = 5000.0;

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Updated Registration Fee: " + registrationFee);
    }

    // ---------- INSTANCE VARIABLES ----------
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;  // FINAL → cannot be changed

    // ---------- CONSTRUCTOR USING THIS ----------
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;                 // this resolves ambiguity
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // ---------- METHOD TO DISPLAY DETAILS ----------
    public void displayDetails() {
        System.out.println("\n--- Vehicle Registration Details ---");
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}



// ---------- MAIN CLASS TO TEST EVERYTHING ----------
public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Sonu", "Bike", "DL-09-AB-1234");
        Vehicle v2 = new Vehicle("Aman", "Car", "DL-01-CD-5678");

        // INSTANCEOF CHECK BEFORE DISPLAYING DETAILS
        if (v1 instanceof Vehicle) {
            v1.displayDetails();
        }

        if (v2 instanceof Vehicle) {
            v2.displayDetails();
        }

        // Updating static registration fee
        Vehicle.updateRegistrationFee(6000.0);
    }
}

