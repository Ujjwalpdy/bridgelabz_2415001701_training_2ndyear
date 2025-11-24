import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
    public static void main(String[] args) {
        int[] agesArray = {25, 30, 22, 45, 28};

        // Convert int[] to ArrayList<Integer> using wrapper class (autoboxing)
        ArrayList<Integer> agesList = new ArrayList<>();
        for (int age : agesArray) {
            agesList.add(age); // autoboxing
        }

        int youngest = Collections.min(agesList);
        int oldest = Collections.max(agesList);

        System.out.println("Ages List: " + agesList);
        System.out.println("Youngest Employee: " + youngest);
        System.out.println("Oldest Employee: " + oldest);
    }
}
