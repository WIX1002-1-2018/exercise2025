package W12;

import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E12 - Advanced Polymorphism with Abstract Classes and Inheritance
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Combine abstract classes with concrete implementations
 * - Use constructor chaining with super() in inheritance hierarchy
 * - Override and overload methods for specialized behavior
 * - Handle complex input parsing with exception handling
 */
public class W12E12 {

    public static void main(String[] args) {
        // Input data: account type, account number, and transaction amount
        String transactions = "SAVINGS 1001 500.0\nCHECKING 2001 300.0\nSAVINGS 1001 100.0";
        AccountE12[] accounts = new AccountE12[10];
        int count = 0;

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(transactions);
             PrintWriter writer = new PrintWriter("W12E12_accounts.txt")) {
            
            // Set locale for consistent number parsing (US format)
            scanner.useLocale(Locale.US);

            // Parse input tokens and create account objects
            while (scanner.hasNext() && count < accounts.length) {
                try {
                    String type = scanner.next();
                    
                    if (scanner.hasNextInt()) {
                        int accountNum = scanner.nextInt();
                        
                        if (scanner.hasNextDouble()) {
                            double amount = scanner.nextDouble();
                            
                            // Create or update account based on type
                            if ("SAVINGS".equalsIgnoreCase(type)) {
                                accounts[count++] = new SavingsAccountE12(accountNum, amount);
                            } else if ("CHECKING".equalsIgnoreCase(type)) {
                                accounts[count++] = new CheckingAccountE12(accountNum, amount);
                            }
                        }
                    }
                } catch (InputMismatchException e) {
                    // Skip invalid tokens
                    scanner.next();
                }
            }

            // Process accounts and write results
            writer.println("Account Summary:");
            writer.println("================");
            
            for (int i = 0; i < count; i++) {
                writer.println("\n" + accounts[i].getAccountInfo());
                
                // Calculate interest with default rate
                writer.println("Interest earned: $" + 
                               String.format(Locale.US, "%.2f", accounts[i].calculateInterest()));
                
                // Calculate interest with custom rate (overloaded method)
                writer.println("Interest with 5% rate: $" + 
                               String.format(Locale.US, "%.2f", accounts[i].calculateInterest(0.05)));
                
                // Show balance after interest
                writer.println("Balance after interest: $" + 
                               String.format(Locale.US, "%.2f", 
                               accounts[i].getBalance() + accounts[i].calculateInterest()));
            }
            
            System.out.println("Account summary saved to W12E12_accounts.txt");
            
        } catch (Exception e) {
            System.out.println("Error processing accounts: " + e.getMessage());
        }
    }
}

// Abstract base class for bank accounts
abstract class AccountE12 {
    private final int accountNumber;
    private final double balance;

    // Constructor with account number and balance
    AccountE12(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract method: each account type must define its own interest calculation
    abstract double calculateInterest();

    // Overloaded version: calculate interest with custom rate
    abstract double calculateInterest(double rate);

    // Get account balance
    double getBalance() {
        return balance;
    }

    // Get account information (can be overridden)
    String getAccountInfo() {
        return getClass().getSimpleName() + " #" + accountNumber + 
               ", Balance: $" + String.format(Locale.US, "%.2f", balance);
    }
}

// Concrete subclass: Savings account with higher interest rate
class SavingsAccountE12 extends AccountE12 {
    private static final double DEFAULT_RATE = 0.03; // 3% interest

    SavingsAccountE12(int accountNumber, double balance) {
        // Call parent constructor with super()
        super(accountNumber, balance);
    }

    // OVERRIDES calculateInterest() - uses savings-specific rate
    @Override
    double calculateInterest() {
        return getBalance() * DEFAULT_RATE;
    }

    // OVERRIDES overloaded calculateInterest with custom rate
    @Override
    double calculateInterest(double rate) {
        return getBalance() * rate;
    }

    // OVERRIDES getAccountInfo() to add account type details
    @Override
    String getAccountInfo() {
        return super.getAccountInfo() + " [Savings, " + 
               String.format(Locale.US, "%.1f", DEFAULT_RATE * 100) + "% APY]";
    }
}

// Concrete subclass: Checking account with lower interest rate
class CheckingAccountE12 extends AccountE12 {
    private static final double DEFAULT_RATE = 0.01; // 1% interest

    CheckingAccountE12(int accountNumber, double balance) {
        // Call parent constructor with super()
        super(accountNumber, balance);
    }

    // OVERRIDES calculateInterest() - uses checking-specific rate
    @Override
    double calculateInterest() {
        return getBalance() * DEFAULT_RATE;
    }

    // OVERRIDES overloaded calculateInterest with custom rate
    @Override
    double calculateInterest(double rate) {
        return getBalance() * rate;
    }

    // OVERRIDES getAccountInfo() to add account type details
    @Override
    String getAccountInfo() {
        return super.getAccountInfo() + " [Checking, " + 
               String.format(Locale.US, "%.1f", DEFAULT_RATE * 100) + "% APY]";
    }
}
