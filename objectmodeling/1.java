import java.util.ArrayList;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book: " + title + " | Author: " + author);
    }
}

class Library {
    String libraryName;
    ArrayList<Book> books = new ArrayList<>();  // Aggregation

    Library(String libraryName) {
        this.libraryName = libraryName;
    }

    void addBook(Book b) {
        books.add(b);
    }

    void displayLibraryBooks() {
        System.out.println("\nLibrary: " + libraryName);
        for (Book b : books) {
            b.displayBook();
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // Books exist independently
        Book b1 = new Book("Java Complete Reference", "Herbert Schildt");
        Book b2 = new Book("Clean Code", "Robert Martin");
        Book b3 = new Book("DSA Handbook", "Narasimha Karumanchi");

        // Libraries aggregate books
        Library l1 = new Library("City Library");
        Library l2 = new Library("College Library");

        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b2);
        l2.addBook(b3);

        l1.displayLibraryBooks();
        l2.displayLibraryBooks();
    }
}
