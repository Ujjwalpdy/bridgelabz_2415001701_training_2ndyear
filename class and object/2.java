public class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Book b = new Book("Java Basics", "James Gosling", 499.99);
        b.display();
    }
} 
