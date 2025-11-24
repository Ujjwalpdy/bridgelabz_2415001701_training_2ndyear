import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        Set<Integer> seen = new LinkedHashSet<>(); // preserves order
        seen.addAll(list);

        List<Integer> result = new ArrayList<>(seen);
        System.out.println("List after removing duplicates: " + result);
        sc.close();
    }
}