package W10;

/**
 * W10E10 - Comprehensive Example: Library System
 * 
 * LEARNING OBJECTIVES:
 * - Apply all concepts learned in Week 10
 * - Build a complete, practical application
 * - Practice object-oriented programming principles
 * 
 * JOURNAL:
 * This is a comprehensive example that brings together:
 * 1. Classes with private instance variables
 * 2. Constructor overloading
 * 3. Getter and setter methods (accessors and mutators)
 * 4. Method overloading
 * 5. Object interactions
 * 6. Data validation
 * 
 * We'll create a simple library system with Book and Library classes.
 */

class Book {
    // Private instance variables
    private String isbn;
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;
    private String borrower;
    
    // Constructor Overloading
    
    public Book(String isbn, String title, String author, int year) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publicationYear = year;
        this.isAvailable = true;
        this.borrower = null;
    }
    
    public Book(String isbn, String title, String author) {
        this(isbn, title, author, 2024);  // Calls the other constructor
    }
    
    // Getters
    public String getIsbn() {
        return isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean isAvailable() {
        return isAvailable;
    }
    
    public String getBorrower() {
        return borrower;
    }
    
    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    // Method Overloading for borrowBook
    
    public boolean borrowBook(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            borrower = borrowerName;
            System.out.println("Book '" + title + "' borrowed by " + borrowerName);
            return true;
        } else {
            System.out.println("Book '" + title + "' is not available (borrowed by " + borrower + ")");
            return false;
        }
    }
    
    public boolean borrowBook(String borrowerName, int days) {
        if (isAvailable) {
            isAvailable = false;
            borrower = borrowerName;
            System.out.println("Book '" + title + "' borrowed by " + borrowerName + " for " + days + " days");
            return true;
        } else {
            System.out.println("Book '" + title + "' is not available");
            return false;
        }
    }
    
    // Return book
    public void returnBook() {
        if (!isAvailable) {
            System.out.println("Book '" + title + "' returned by " + borrower);
            isAvailable = true;
            borrower = null;
        } else {
            System.out.println("Book '" + title + "' is already available");
        }
    }
    
    // Display book information (method overloading)
    
    public void displayInfo() {
        System.out.println("\n--- Book Information ---");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + publicationYear);
        System.out.println("Status: " + (isAvailable ? "Available" : "Borrowed by " + borrower));
    }
    
    public void displayInfo(boolean detailed) {
        if (detailed) {
            displayInfo();
            System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
            if (!isAvailable) {
                System.out.println("Current Borrower: " + borrower);
            }
        } else {
            System.out.println(title + " by " + author + " [" + (isAvailable ? "Available" : "Borrowed") + "]");
        }
    }
}

class Library {
    private String libraryName;
    private Book[] books;
    private int bookCount;
    
    // Constructor Overloading
    
    public Library(String name, int capacity) {
        libraryName = name;
        books = new Book[capacity];
        bookCount = 0;
        System.out.println("Library '" + name + "' created with capacity: " + capacity);
    }
    
    public Library(String name) {
        this(name, 100);  // Default capacity of 100
    }
    
    // Method Overloading for addBook
    
    public boolean addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
            System.out.println("Book '" + book.getTitle() + "' added to library");
            return true;
        } else {
            System.out.println("Library is full! Cannot add more books.");
            return false;
        }
    }
    
    public boolean addBook(String isbn, String title, String author, int year) {
        Book book = new Book(isbn, title, author, year);
        return addBook(book);
    }
    
    public boolean addBook(String isbn, String title, String author) {
        Book book = new Book(isbn, title, author);
        return addBook(book);
    }
    
    // Method Overloading for findBook
    
    public Book findBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }
        return null;
    }
    
    public void findBook(String keyword, boolean searchInTitle) {
        System.out.println("\nSearching for: " + keyword);
        boolean found = false;
        
        for (int i = 0; i < bookCount; i++) {
            if (searchInTitle && books[i].getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                books[i].displayInfo(false);
                found = true;
            } else if (!searchInTitle && books[i].getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                books[i].displayInfo(false);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No books found matching: " + keyword);
        }
    }
    
    // Display library information
    
    public void displayLibraryInfo() {
        System.out.println("\n========================================");
        System.out.println("Library: " + libraryName);
        System.out.println("Total Books: " + bookCount);
        System.out.println("Capacity: " + books.length);
        System.out.println("========================================");
    }
    
    public void displayAllBooks() {
        displayLibraryInfo();
        System.out.println("\nAll Books:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayInfo(false);
        }
    }
    
    public void displayAvailableBooks() {
        System.out.println("\nAvailable Books:");
        int count = 0;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                books[i].displayInfo(false);
                count++;
            }
        }
        System.out.println("Total available: " + count);
    }
}

public class W10E10 {
    public static void main(String[] args) {
        System.out.println("=== COMPREHENSIVE LIBRARY SYSTEM EXAMPLE ===\n");
        
        // Create a library using constructor overloading
        Library library = new Library("City Central Library", 50);
        
        System.out.println("\n=== Adding Books (Method Overloading) ===\n");
        
        // Add books using different methods
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch", 2017);
        library.addBook("978-0596009205", "Head First Java", "Kathy Sierra");
        
        Book book1 = new Book("978-0321356683", "Effective C++", "Scott Meyers", 2005);
        library.addBook(book1);
        
        library.addBook("978-0132350884", "Clean Code", "Robert Martin", 2008);
        library.addBook("978-0201633610", "Design Patterns", "Gang of Four", 1994);
        
        // Display all books
        System.out.println("\n=== Library Catalog ===");
        library.displayAllBooks();
        
        System.out.println("\n=== Borrowing Books ===\n");
        
        // Find and borrow books
        Book javaBook = library.findBook("978-0134685991");
        if (javaBook != null) {
            javaBook.borrowBook("Alice Johnson");
            javaBook.displayInfo(true);
        }
        
        Book headFirst = library.findBook("978-0596009205");
        if (headFirst != null) {
            headFirst.borrowBook("Bob Smith", 14);
        }
        
        // Display available books
        System.out.println("\n=== After Borrowing ===");
        library.displayAvailableBooks();
        
        System.out.println("\n=== Searching Books ===");
        library.findBook("Java", true);      // Search in titles
        library.findBook("Martin", false);   // Search in authors
        
        System.out.println("\n=== Returning Books ===\n");
        if (javaBook != null) {
            javaBook.returnBook();
        }
        
        // Final status
        System.out.println("\n=== Final Library Status ===");
        library.displayAvailableBooks();
        
        System.out.println("\n=== KEY CONCEPTS DEMONSTRATED ===");
        System.out.println("✓ Classes with private instance variables");
        System.out.println("✓ Constructor overloading (multiple constructors)");
        System.out.println("✓ Getter and setter methods (encapsulation)");
        System.out.println("✓ Method overloading (same name, different parameters)");
        System.out.println("✓ Object interactions (Library uses Book objects)");
        System.out.println("✓ Data validation and error handling");
        System.out.println("✓ Practical real-world application");
        
        System.out.println("\n=== CONGRATULATIONS! ===");
        System.out.println("You've completed Week 10 - Object-Oriented Programming in Java!");
        System.out.println("You now understand:");
        System.out.println("  • Classes and objects");
        System.out.println("  • Constructors and constructor overloading");
        System.out.println("  • Encapsulation with getters and setters");
        System.out.println("  • Method overloading");
        System.out.println("  • Building complete OOP applications");
    }
}
