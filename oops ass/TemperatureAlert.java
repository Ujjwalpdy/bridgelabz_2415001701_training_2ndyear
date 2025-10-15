import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> isHighTemp = temp -> temp > 40.0;

        double currentTemp = 42.5;

        if (isHighTemp.test(currentTemp)) {
            System.out.println("Alert! Temperature crossed threshold: " + currentTemp);
        } else {
            System.out.println("Temperature is normal: " + currentTemp);
        }
    }
}
