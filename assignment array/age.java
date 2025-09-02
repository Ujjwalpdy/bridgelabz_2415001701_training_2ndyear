import java.util.*;

public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of 10 students' ages
        int[] ages = new int[10];

        // Taking input
        System.out.println("Enter ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < 0) {
                System.out.println("Invalid age entered: " + ages[i]);
            } else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            } else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }
        }

        sc.close();
    }
}
