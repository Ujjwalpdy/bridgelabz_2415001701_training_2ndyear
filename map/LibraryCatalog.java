import java.util.*;

public class LibraryCatalog {
    public static void main(String[] args) {
        Map<String, String> catalog = new TreeMap<>(); // sorted by ISBN

        // 1. Add books
        catalog.put("978-1111111111", "Java Basics");
        catalog.put("978-2222222222", "Python Essentials");
        catalog.put("978-3333333333", "Data Structures");

        // 2. Search by ISBN
        searchByISBN(catalog, "978-2222222222");
        searchByISBN(catalog, "978-4444444444");

        // 3. Remove a book
        catalog.remove("978-1111111111");

        // 4. Print all books
        System.out.println("Books in library:");
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 5. Search by title
        searchByTitle(catalog, "Data Structures");
    }

    static void searchByISBN(Map<String, String> catalog, String isbn) {
        if (catalog.containsKey(isbn)) {
            System.out.println("Found: " + catalog.get(isbn));
        } else {
            System.out.println("Book not found for ISBN: " + isbn);
        }
    }

    static void searchByTitle(Map<String, String> catalog, String title) {
        boolean found = false;
        for (Map.Entry<String, String> entry : catalog.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(title)) {
                System.out.println("Found ISBN: " + entry.getKey());
                found = true;
            }
        }
        if (!found) System.out.println("Title not found: " + title);
    }
}