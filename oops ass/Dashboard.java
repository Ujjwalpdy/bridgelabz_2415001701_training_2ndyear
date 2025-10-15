interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}

class Car implements Vehicle {
    public void displaySpeed() {
        System.out.println("Car speed: 80 km/h");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() {
        System.out.println("Electric car speed: 100 km/h");
    }
    public void displayBattery() {
        System.out.println("Battery: 85%");
    }
}

public class Dashboard {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle ecar = new ElectricCar();
        car.displaySpeed();
        car.displayBattery();
        ecar.displaySpeed();
        ecar.displayBattery();
    }
}
