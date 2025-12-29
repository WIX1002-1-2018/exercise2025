package W10;

/**
 * W10E02 - Instance Variables and Methods
 * 
 * LEARNING OBJECTIVES:
 * - Add methods to a class
 * - Understand instance variables vs local variables
 * - Learn how methods can use instance variables
 * 
 * JOURNAL:
 * Methods define the behavior of a class. They can:
 * - Perform actions
 * - Return values
 * - Access and modify instance variables
 * 
 * Instance variables belong to the object and exist as long as the object exists.
 * Local variables exist only within a method.
 */

class Book {
    // Instance variables - belong to the object
    String title;
    String author;
    int pages;
    int currentPage;
    
    // Method to display book information
    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Current Page: " + currentPage);
    }
    
    // Method to read pages
    void readPages(int numPages) {
        // numPages is a local variable (method parameter)
        currentPage = currentPage + numPages;
        
        if (currentPage > pages) {
            currentPage = pages; // Can't read beyond the book
        }
        
        System.out.println("Reading " + numPages + " pages...");
        System.out.println("Now at page " + currentPage + " of " + pages);
    }
    
    // Method to check if book is finished
    boolean isFinished() {
        return currentPage >= pages;
    }
}

public class W10E02 {
    public static void main(String[] args) {
        // Create a book object
        Book myBook = new Book();
        myBook.title = "Java Programming";
        myBook.author = "John Smith";
        myBook.pages = 300;
        myBook.currentPage = 0;
        
        System.out.println("=== Book Information ===");
        myBook.displayInfo();
        
        System.out.println("\n=== Reading the Book ===");
        myBook.readPages(50);
        myBook.readPages(100);
        myBook.readPages(200);
        
        System.out.println("\n=== Checking Status ===");
        if (myBook.isFinished()) {
            System.out.println("Book finished!");
        } else {
            System.out.println("Still reading...");
        }
        
        // KEY TAKEAWAY:
        // - Methods define what an object can do
        // - Methods can access instance variables
        // - Methods can have parameters (local variables)
        // - Methods can return values
    }
}
