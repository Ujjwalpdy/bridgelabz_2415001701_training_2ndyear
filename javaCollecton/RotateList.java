import java.util.*;

public class RotateList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.print("Enter rotation positions: ");
        int k = sc.nextInt();

        k = k % list.size(); // handle rotation greater than list size
        List<Integer> rotated = new ArrayList<>();

        // Add elements from k to end
        for (int i = k; i < list.size(); i++) rotated.add(list.get(i));
        // Add elements from 0 to k-1
        for (int i = 0; i < k; i++) rotated.add(list.get(i));

        System.out.println("Rotated List: " + rotated);
        sc.close();
    }
}
