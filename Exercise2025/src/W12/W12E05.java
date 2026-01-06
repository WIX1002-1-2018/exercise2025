package W12;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E05 - Overloading Constructors and File Output
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Overload constructors for flexible object creation
 * - Override toString() for readable summaries
 * - Use Scanner to process commands and PrintWriter to persist results
 */
public class W12E05 {

    public static void main(String[] args) {
        // Define a script with transaction commands (simulating user input)
        String script = "DEPOSIT 150\nWITHDRAW 20\nDEPOSIT 40";
        
        // Create a bank account with just a name (uses constructor that defaults balance to 0)
        BankAccountE05 account = new BankAccountE05("Student Saver");

        // Try-with-resources: automatically closes Scanner and PrintWriter when done
        try (Scanner scanner = new Scanner(script);
             PrintWriter writer = new PrintWriter("W12E05_statement.txt")) {
            
            // Set locale to US to ensure proper decimal formatting (dot instead of comma)
            scanner.useLocale(Locale.US);
            
            // Process each command in the script
            while (scanner.hasNext()) {
                String action = scanner.next();  // Read the command word
                
                // Check if it's a DEPOSIT command and next token is a number
                if ("DEPOSIT".equalsIgnoreCase(action) && scanner.hasNextDouble()) {
                    account.deposit(scanner.nextDouble());
                } 
                // Check if it's a WITHDRAW command and next token is a number
                else if ("WITHDRAW".equalsIgnoreCase(action) && scanner.hasNextDouble()) {
                    account.withdraw(scanner.nextDouble());
                }
            }
            
            // Write account summary to file
            // This automatically calls account.toString() due to PrintWriter's println behavior
            writer.println(account);
            System.out.println("Statement saved to W12E05_statement.txt");
            
        } catch (Exception e) {
            // Handle file I/O errors or other exceptions
            System.out.println("Could not write statement: " + e.getMessage());
        }
    }
}

/**
 * BankAccountE05 - A simple bank account class demonstrating constructor overloading
 * Shows how to provide multiple ways to create an object with different initial states
 */
class BankAccountE05 {
    // Immutable account name
    private final String name;
    // Mutable balance (can be changed through deposits and withdrawals)
    private double balance;

    /**
     * Constructor with name only - defaults balance to 0
     * This is a convenience constructor that delegates to the full constructor
     * @param name - account holder's name
     */
    BankAccountE05(String name) {
        // Constructor chaining: this() calls another constructor in the same class
        // Must be the first statement in the constructor
        this(name, 0);
    }

    /**
     * Full constructor with name and initial balance
     * Constructor overloading: same class, multiple constructors with different parameters
     * @param name - account holder's name
     * @param initialBalance - starting balance for the account
     */
    BankAccountE05(String name, double initialBalance) {
        this.name = name;
        this.balance = initialBalance;
    }

    /**
     * Deposit money into the account
     * @param amount - amount to deposit
     */
    void deposit(double amount) {
        balance += amount;
    }

    /**
     * Overloaded deposit method that includes a note
     * Method overloading: same name, different parameters
     * Demonstrates reusing the simpler version
     * @param amount - amount to deposit
     * @param note - optional note about the deposit
     */
    void deposit(double amount, String note) {
        // Reuse the single-parameter deposit method
        deposit(amount);
        System.out.println("Note: " + note);
    }

    /**
     * Withdraw money from the account
     * Note: No validation - allows negative balance (overdraft)
     * @param amount - amount to withdraw
     */
    void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Override toString() to provide a readable string representation
     * This is called automatically when the object is printed or converted to string
     * @return formatted string with account name and balance
     */
    @Override
    public String toString() {
        // String.format with Locale.US ensures dot decimal separator (e.g., 170.00)
        // %.2f formats the balance to 2 decimal places
        return name + " balance: " + String.format(Locale.US, "%.2f", balance);
    }
}
