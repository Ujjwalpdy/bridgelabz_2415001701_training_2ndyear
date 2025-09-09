import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class OTPGenerator {

    // Generate a 6-digit OTP
    public static int generateOTP() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000); // ensures 6-digit number
    }

    // Generate 10 OTPs and store in an array
    public static int[] generateOTPs(int count) {
        int[] otps = new int[count];
        for (int i = 0; i < count; i++) {
            otps[i] = generateOTP();
        }
        return otps;
    }

    // Check if OTPs are unique
    public static boolean areUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false; // duplicate found
        }
        return true;
    }

    public static void main(String[] args) {
        int[] otps = generateOTPs(10);
        System.out.println("Generated OTPs:");
        for (int otp : otps) {
            System.out.println(otp);
        }
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }
}
