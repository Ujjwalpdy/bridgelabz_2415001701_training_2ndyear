// Custom Exceptions
class ServiceOverdueException extends Exception {
    public ServiceOverdueException(String msg) { super(msg); }
}
class InvalidMileageException extends Exception {
    public InvalidMileageException(String msg) { super(msg); }
}

class Vehicle {
    private int mileage;
    private boolean serviceOverdue;

    public Vehicle(int mileage, boolean serviceOverdue) {
        this.mileage = mileage;
        this.serviceOverdue = serviceOverdue;
    }

    public void checkMaintenance() throws ServiceOverdueException, InvalidMileageException {
        if (mileage < 0) throw new InvalidMileageException("Mileage cannot be negative!");
        if (serviceOverdue) throw new ServiceOverdueException("Service is overdue! Please visit the garage.");
        System.out.println("Vehicle maintenance is up to date.");
    }
}

// Main
public class VehicleMaintenanceApp {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(-10, true);

        try {
            v.checkMaintenance();
        } catch (InvalidMileageException | ServiceOverdueException e) {
            System.out.println(e.getMessage());
        }
    }
}