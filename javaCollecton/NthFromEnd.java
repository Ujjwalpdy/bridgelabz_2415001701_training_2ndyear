import java.util.*;

public class NthFromEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        sc.nextLine();

        LinkedList<String> list = new LinkedList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextLine());

        System.out.print("Enter N (from end): ");
        int N = sc.nextInt();

        if (N <= 0) {
            System.out.println("Invalid N");
        } else {
            ListIterator<String> iter = list.listIterator(list.size());
            int count = 0;
            String result = null;
            while (iter.hasPrevious()) {
                result = iter.previous();
                count++;
                if (count == N) break;
            }
            if (count == N) System.out.println("Nth element from end: " + result);
            else System.out.println("N is greater than list size");
        }

        sc.close();
    }
}