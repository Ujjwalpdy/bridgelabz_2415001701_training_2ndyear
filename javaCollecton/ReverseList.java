import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int n = sc.nextInt();
        
        // For ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Enter elements for ArrayList:");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
        }
        
        // Reverse manually
        ArrayList<Integer> reversedArrayList = new ArrayList<>();
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedArrayList.add(arrayList.get(i));
        }
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        // For LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
        LinkedList<Integer> reversedLinkedList = new LinkedList<>();
        ListIterator<Integer> iter = linkedList.listIterator(linkedList.size());
        while (iter.hasPrevious()) {
            reversedLinkedList.add(iter.previous());
        }
        System.out.println("Reversed LinkedList: " + reversedLinkedList);

        sc.close();
    }
}