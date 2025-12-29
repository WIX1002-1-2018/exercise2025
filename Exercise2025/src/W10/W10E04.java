package W10;

/**
 * W10E04 - Accessor Methods (Getters)
 * 
 * LEARNING OBJECTIVES:
 * - Understand encapsulation and data hiding
 * - Learn about private access modifier
 * - Create and use getter methods (accessors)
 * 
 * JOURNAL:
 * Accessor methods (getters) are used to:
 * - Retrieve the value of private instance variables
 * - Provide controlled access to data
 * - Follow the principle of encapsulation
 * 
 * Naming convention: getVariableName()
 * For boolean: isVariableName()
 * 
 * Why use private variables and getters?
 * - Protects data from direct modification
 * - Allows validation and control
 * - Enables changing internal implementation without affecting external code
 */

class BankAccount {
    // Private instance variables - cannot be accessed directly from outside
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean isActive;
    
    // Constructor
    BankAccount(String accNum, String holder, double initialBalance) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = initialBalance;
        isActive = true;
    }
    
    // Accessor methods (Getters) - provide read access to private variables
    
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public boolean isActive() {  // For boolean, we use 'is' instead of 'get'
        return isActive;
    }
    
    // Method to display account information using getters internally
    public void displayAccountInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Active: " + (isActive() ? "Yes" : "No"));
    }
}

public class W10E04 {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("ACC001", "John Doe", 1000.00);
        
        System.out.println("=== Accessing Account Information ===");
        
        // We CANNOT do this anymore because variables are private:
        // System.out.println(account.balance); // This would cause an error!
        
        // Instead, we use getter methods:
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("Is Active: " + account.isActive());
        
        System.out.println("\n=== Using Display Method ===");
        account.displayAccountInfo();
        
        // KEY TAKEAWAY:
        // - Use 'private' to hide instance variables
        // - Use 'public' getter methods to provide read access
        // - Getters return the value of private variables
        // - This is called ENCAPSULATION - hiding internal details
        // - Format: public ReturnType getVariableName() { return variableName; }
    }
}
