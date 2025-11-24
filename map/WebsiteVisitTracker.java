import java.util.*;

public class WebsiteVisitTracker {
    public static void main(String[] args) {
        String[] pageVisits = {"home", "about", "products", "home", "products", "contact", "home", "blog", "products"};

        Map<String, Integer> visits = new HashMap<>();
        for (String page : pageVisits) {
            visits.put(page, visits.getOrDefault(page, 0) + 1);
        }

        // Sort pages by descending visit count
        List<Map.Entry<String, Integer>> list = new ArrayList<>(visits.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Pages sorted by visit count:");
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Page with most visits
        Map.Entry<String, Integer> top = list.get(0);
        System.out.println("\nMost visited page: " + top.getKey() + " (" + top.getValue() + " visits)");
    }
}