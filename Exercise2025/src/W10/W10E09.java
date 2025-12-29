package W10;

/**
 * W10E09 - Combining Constructor and Method Overloading
 * 
 * LEARNING OBJECTIVES:
 * - Use constructor overloading and method overloading together
 * - Create a practical, real-world class
 * - Practice all concepts learned so far
 * 
 * JOURNAL:
 * In real applications, classes often use both:
 * - Constructor overloading: Multiple ways to create objects
 * - Method overloading: Multiple ways to perform operations
 * 
 * This combination provides maximum flexibility and usability.
 * Let's create a BankAccount class that demonstrates both concepts.
 */

class BankAccount {
    // Private instance variables
    private String accountNumber;
    private String accountHolder;
    private double balance;
    private String accountType;
    
    // Constructor Overloading
    
    // Constructor 1: Full details
    public BankAccount(String accNum, String holder, double initialBalance, String type) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = initialBalance;
        accountType = type;
        System.out.println("Account created with all details");
    }
    
    // Constructor 2: Without account type (defaults to Savings)
    public BankAccount(String accNum, String holder, double initialBalance) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = initialBalance;
        accountType = "Savings";
        System.out.println("Account created with default type (Savings)");
    }
    
    // Constructor 3: New account with zero balance
    public BankAccount(String accNum, String holder) {
        accountNumber = accNum;
        accountHolder = holder;
        balance = 0.0;
        accountType = "Savings";
        System.out.println("Account created with zero balance");
    }
    
    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolder() {
        return accountHolder;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Setters (only for changeable properties)
    public void setAccountHolder(String holder) {
        accountHolder = holder;
    }
    
    public void setAccountType(String type) {
        accountType = type;
    }
    
    // Method Overloading for deposit
    
    // Deposit with just amount
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }
    
    // Deposit with amount and description
    public void deposit(double amount, String description) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + " (" + description + ")");
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Error: Deposit amount must be positive!");
        }
    }
    
    // Method Overloading for withdraw
    
    // Withdraw with just amount
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
            System.out.println("New balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds!");
            return false;
        } else {
            System.out.println("Error: Withdrawal amount must be positive!");
            return false;
        }
    }
    
    // Withdraw with amount and description
    public boolean withdraw(double amount, String description) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount + " (" + description + ")");
            System.out.println("New balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Error: Insufficient funds for " + description + "!");
            return false;
        } else {
            System.out.println("Error: Withdrawal amount must be positive!");
            return false;
        }
    }
    
    // Method Overloading for transfer
    
    // Transfer to another account
    public boolean transfer(BankAccount recipient, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred: $" + amount + " to " + recipient.getAccountHolder());
            System.out.println("Your new balance: $" + balance);
            return true;
        } else {
            System.out.println("Error: Transfer failed!");
            return false;
        }
    }
    
    // Transfer with description
    public boolean transfer(BankAccount recipient, double amount, String description) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            recipient.balance += amount;
            System.out.println("Transferred: $" + amount + " to " + recipient.getAccountHolder());
            System.out.println("Description: " + description);
            System.out.println("Your new balance: $" + balance);
            return true;
        } else {
            System.out.println("Error: Transfer failed!");
            return false;
        }
    }
    
    // Display account information
    public void displayAccountInfo() {
        System.out.println("\n=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }
}

public class W10E09 {
    public static void main(String[] args) {
        System.out.println("=== Demonstrating Constructor Overloading ===\n");
        
        // Using different constructors
        BankAccount account1 = new BankAccount("ACC001", "John Doe", 1000.0, "Checking");
        BankAccount account2 = new BankAccount("ACC002", "Jane Smith", 500.0);
        BankAccount account3 = new BankAccount("ACC003", "Bob Johnson");
        
        System.out.println("\n=== Demonstrating Method Overloading: Deposits ===\n");
        account1.deposit(200.0);
        account1.deposit(150.0, "Salary");
        
        System.out.println("\n=== Demonstrating Method Overloading: Withdrawals ===\n");
        account1.withdraw(100.0);
        account1.withdraw(50.0, "ATM Withdrawal");
        account1.withdraw(5000.0, "Large Purchase");  // Should fail
        
        System.out.println("\n=== Demonstrating Method Overloading: Transfers ===\n");
        account1.transfer(account2, 300.0);
        account1.transfer(account3, 150.0, "Gift");
        
        System.out.println("\n=== Final Account States ===");
        account1.displayAccountInfo();
        account2.displayAccountInfo();
        account3.displayAccountInfo();
        
        // KEY TAKEAWAY:
        // - Constructor overloading: Multiple ways to create objects
        // - Method overloading: Multiple ways to perform operations
        // - Together, they make classes flexible and user-friendly
        // - Real-world classes often use both techniques
        // - Choose the right constructor/method based on available information
    }
}
