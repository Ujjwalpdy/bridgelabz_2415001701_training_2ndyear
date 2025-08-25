import java.util.Scanner;
public class max_handshakes {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        // Formula for max handshakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Output
        System.out.println("The maximum number of possible handshakes among " +
                           numberOfStudents + " students is " + handshakes);

        input.close();
    }
}

