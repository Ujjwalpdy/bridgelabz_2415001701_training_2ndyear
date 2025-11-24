class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Published: " + publicationYear);
    }
}

class Author extends Book {
    String name;
    String bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}

public class Main {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2023, "Sonu", "Tech Writer");
        a.displayInfo();
    }
}