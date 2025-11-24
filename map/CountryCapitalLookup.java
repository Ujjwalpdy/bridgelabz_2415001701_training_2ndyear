import java.util.*;

public class CountryCapitalLookup {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>(); // alphabetical order
        capitals.put("India", "New Delhi");
        capitals.put("USA", "Washington D.C.");
        capitals.put("Japan", "Tokyo");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Canada", "Ottawa");
        capitals.put("Australia", "Canberra");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a country to find its capital: ");
        String country = sc.nextLine();

        String capital = capitals.get(country);
        if (capital != null) System.out.println("Capital: " + capital);
        else System.out.println("Unknown country");

        System.out.println("\nAll countries and capitals:");
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        sc.close();
    }
}