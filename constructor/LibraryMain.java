class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    void borrow() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully!");
        } else {
            System.out.println("Book is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + available);
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        LibraryBook lb = new LibraryBook("C++ Guide", "Bjarne Stroustrup", 399);

        lb.display();
        lb.borrow();
        lb.borrow(); // second attempt fails
    }
}
