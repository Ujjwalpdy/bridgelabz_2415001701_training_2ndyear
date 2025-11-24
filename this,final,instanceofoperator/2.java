class Book {

    // --------- STATIC ---------
    private static String libraryName = "Central City Library";

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // --------- INSTANCE VARIABLES ---------
    private String title;
    private String author;
    private final String isbn;   // FINAL → cannot change once assigned

    // --------- CONSTRUCTOR USING THIS ---------
    public Book(String title, String author, String isbn) {
        this.title = title;      // this resolves ambiguity
        this.author = author;
        this.isbn = isbn;        // final initialization
    }

    // --------- METHOD TO DISPLAY BOOK DETAILS ---------
    public void displayBookDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Returning ISBN (as your hint: return isbn)
    public String getIsbn() {
        return isbn;
    }
}



// --------- MAIN CLASS FOR TESTING ----------
public class Main {
    public static void main(String[] args) {

        // Display static library name
        Book.displayLibraryName();

        // Creating objects
        Book b1 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "ISBN1001");
        Book b2 = new Book("Atomic Habits", "James Clear", "ISBN2002");

        // INSTANCEOF CHECK
        if (b1 instanceof Book) {
            b1.displayBookDetails();
        }

        if (b2 instanceof Book) {
            b2.displayBookDetails();
        }

        // Access final variable
        System.out.println("\nISBN of b1: " + b1.getIsbn());
    }
}