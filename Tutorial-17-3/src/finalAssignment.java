public class finalAssignment {
    public static void main(String[] args) {
        BookManagementSystem system = new BookManagementSystem();

        // Adding books to the system
        system.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565"));
        system.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "9780061120084"));
        system.addBook(new Book("1984", "George Orwell", "9780451524935"));

        // Displaying all books
        system.listBooks();

        // Searching for a book by title
        system.findBookByTitle("To Kill a Mockingbird");
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;

    // Constructor
    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for author
    public String getAuthor() {
        return author;
    }

    // Getter for ISBN
    public String getISBN() {
        return ISBN;
    }
}

class BookManagementSystem {
    private static final int MAX_BOOKS = 100; // Maximum number of books in the system
    private Book[] books; // Array to store books
    private int bookCount; // Current count of books in the system

    // Constructor
    public BookManagementSystem() {
        books = new Book[MAX_BOOKS];
        bookCount = 0;
    }

    // Method to add a book to the system
    public void addBook(Book book) {
        if (bookCount < MAX_BOOKS) {
            books[bookCount++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("The system is full. Cannot add more books.");
        }
    }

    // Method to list all books in the system
    public void listBooks() {
        if (bookCount == 0) {
            System.out.println("No books available.");
        } else {
            System.out.println("List of Books:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("ISBN: " + books[i].getISBN());
                System.out.println();
            }
        }
    }

    // Method to find a book by title
    public void findBookByTitle(String title) {
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().equalsIgnoreCase(title)) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("ISBN: " + books[i].getISBN());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No book with the title \"" + title + "\" found.");
        }
    }
}
