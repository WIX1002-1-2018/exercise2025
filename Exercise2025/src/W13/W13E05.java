package W13;

/**
 * W13E05: Advanced Custom Exceptions with Data Carrying
 * 
 * LEARNING OBJECTIVES:
 * - Create custom exceptions that carry additional data
 * - Pass data from exception to catch block for context-aware error handling
 * - Implement getter methods in custom exception classes
 * - Understand exception object as communication mechanism
 * 
 * KEY CONCEPTS:
 * 1. Custom exceptions can carry more than just a message
 * 2. Add private fields to store additional data
 * 3. Provide getter methods to retrieve this data in catch block
 * 4. This allows detailed error information to be communicated
 * 5. Useful for domain-specific errors (banking, inventory, etc.)
 * 
 * DESIGN PATTERN:
 * public class CustomException extends Exception {
 *     private DataType field;
 *     
 *     public CustomException(String message, DataType value) {
 *         super(message);
 *         this.field = value;
 *     }
 *     
 *     public DataType getField() {
 *         return field;
 *     }
 * }
 * 
 * USAGE:
 * catch (CustomException e) {
 *     System.out.println(e.getMessage());  // Get the error message
 *     System.out.println(e.getField());    // Get the additional data
 * }
 * 
 * BENEFITS:
 * - Rich error information
 * - Allows different handling based on exception data
 * - Makes error messages more informative
 * - Enables logging of detailed error context
 */

/**
 * STEP 1: Define custom exception with data carrying capability
 * 
 * InsufficientFundsException carries the shortage amount
 * This allows the catch block to know HOW MUCH money is needed
 */
class InsufficientFundsException extends Exception {
    // Private field to store the shortage amount
    private double shortageAmount;
    
    /**
     * Constructor that accepts both message and shortage amount
     * 
     * @param message Description of the error
     * @param shortageAmount The amount of money that is missing
     */
    public InsufficientFundsException(double shortageAmount) {
        // Pass a descriptive message to the parent Exception class
        super("Insufficient funds for transaction.");
        // Store the shortage amount for later retrieval
        this.shortageAmount = shortageAmount;
    }
    
    /**
     * Getter method to retrieve the shortage amount
     * The catch block can call this to get the additional data
     * 
     * @return The amount of money that is short
     */
    public double getShortageAmount() {
        return shortageAmount;
    }
}

/**
 * STEP 2: Custom exception for insufficient inventory
 */
class OutOfStockException extends Exception {
    private int itemsRequested;
    private int itemsAvailable;
    
    public OutOfStockException(int requested, int available) {
        super("Insufficient inventory for order.");
        this.itemsRequested = requested;
        this.itemsAvailable = available;
    }
    
    public int getItemsRequested() {
        return itemsRequested;
    }
    
    public int getItemsAvailable() {
        return itemsAvailable;
    }
    
    public int getShortfall() {
        return itemsRequested - itemsAvailable;
    }
}

/**
 * STEP 3: Business logic class using custom exceptions
 */
public class W13E05 {
    
    public static void main(String[] args) {
        // EXAMPLE 1: Banking system with InsufficientFundsException
        System.out.println("=== Example 1: Banking System ===");
        bankingExample();
        System.out.println();
        
        // EXAMPLE 2: Inventory system with OutOfStockException
        System.out.println("=== Example 2: Inventory System ===");
        inventoryExample();
        System.out.println();
        
        // EXAMPLE 3: Multiple transactions with varying results
        System.out.println("=== Example 3: Multiple Transactions ===");
        multipleTransactionsExample();
    }
    
    /**
     * EXAMPLE 1: Banking system demonstrating data-carrying exceptions
     * 
     * KEY POINT:
     * InsufficientFundsException carries the shortfall amount
     * The catch block retrieves this using getShortageAmount()
     * This allows for intelligent error handling and user communication
     */
    public static void bankingExample() {
        // Create a bank account with initial balance
        BankAccount account = new BankAccount(100.00);
        System.out.println("Initial balance: RM " + account.getBalance());
        System.out.println();
        
        // Transaction 1: Withdraw valid amount
        System.out.println("--- Transaction 1: Withdraw RM 50 ---");
        try {
            account.withdraw(50.00);
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: RM " + account.getBalance());
            
        } catch (InsufficientFundsException e) {
            // Exception caught - but this shouldn't happen
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println();
        
        // Transaction 2: Attempt to withdraw more than balance
        System.out.println("--- Transaction 2: Withdraw RM 80 (Balance: RM 50) ---");
        try {
            account.withdraw(80.00);
            System.out.println("Withdrawal successful!");
            System.out.println("New balance: RM " + account.getBalance());
            
        } catch (InsufficientFundsException e) {
            // Exception is caught and we get detailed information
            System.out.println("Transaction FAILED!");
            System.out.println("Error: " + e.getMessage());
            
            // HERE IS THE KEY BENEFIT:
            // We can retrieve the shortage amount to provide detailed feedback
            double needed = e.getShortageAmount();
            System.out.println("Shortfall: RM " + String.format("%.2f", needed));
            System.out.println("Action: Transaction blocked to protect account");
            
            System.out.println("Current balance remains: RM " + account.getBalance());
        }
    }
    
    /**
     * EXAMPLE 2: Inventory system
     */
    public static void inventoryExample() {
        // Create inventory with limited stock
        InventoryManager inventory = new InventoryManager(10);  // 10 items available
        System.out.println("Available inventory: " + inventory.getAvailableItems() + " units");
        System.out.println();
        
        // Order 1: Request less than available
        System.out.println("--- Order 1: Request 5 units ---");
        try {
            inventory.processOrder(5);
            System.out.println("✓ Order fulfilled!");
            System.out.println("Remaining inventory: " + inventory.getAvailableItems());
            
        } catch (OutOfStockException e) {
            System.out.println("✗ Order failed: " + e.getMessage());
        }
        System.out.println();
        
        // Order 2: Request more than available
        System.out.println("--- Order 2: Request 8 units (Only 5 available) ---");
        try {
            inventory.processOrder(8);
            System.out.println("✓ Order fulfilled!");
            
        } catch (OutOfStockException e) {
            // Exception caught with detailed information
            System.out.println("✗ Order rejected!");
            System.out.println("Error: " + e.getMessage());
            
            // Retrieve detailed exception data
            System.out.println("Items requested: " + e.getItemsRequested());
            System.out.println("Items available: " + e.getItemsAvailable());
            System.out.println("Shortfall: " + e.getShortfall() + " units");
            
            System.out.println("Current inventory: " + inventory.getAvailableItems());
        }
    }
    
    /**
     * EXAMPLE 3: Multiple transactions to show pattern
     */
    public static void multipleTransactionsExample() {
        BankAccount account = new BankAccount(200.00);
        
        // Array of withdrawal amounts: {amount to withdraw}
        double[] withdrawals = {50.00, 75.00, 100.00};
        
        System.out.println("Starting balance: RM " + account.getBalance());
        System.out.println();
        
        int transactionNum = 1;
        for (double amount : withdrawals) {
            System.out.println("--- Transaction " + transactionNum + ": Withdraw RM " + 
                             String.format("%.2f", amount) + " ---");
            
            try {
                account.withdraw(amount);
                System.out.println("✓ Success! New balance: RM " + account.getBalance());
                
            } catch (InsufficientFundsException e) {
                // Use the exception's data to provide detailed feedback
                double shortage = e.getShortageAmount();
                System.out.println("✗ Failed! " + e.getMessage());
                System.out.println("  Need RM " + String.format("%.2f", shortage) + 
                                 " more to complete transaction");
            }
            System.out.println();
            transactionNum++;
        }
    }
}

/**
 * STEP 4: Business class - BankAccount
 * 
 * This class demonstrates:
 * - Throwing custom exceptions with data
 * - The throws keyword
 */
class BankAccount {
    private double balance;
    
    /**
     * Constructor
     * 
     * @param initialBalance Starting account balance
     */
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    /**
     * Get current balance
     * 
     * @return The current account balance
     */
    public double getBalance() {
        return balance;
    }
    
    /**
     * Withdraw money from the account
     * 
     * THROWS CLAUSE:
     * This method declares it throws InsufficientFundsException
     * The caller MUST handle it with try-catch
     * 
     * IMPORTANT PATTERN:
     * If amount > balance, throw exception WITH the shortage amount
     * This allows catch block to access the shortage and handle it intelligently
     * 
     * @param amount The amount to withdraw
     * @throws InsufficientFundsException if insufficient balance
     */
    public void withdraw(double amount) throws InsufficientFundsException {
        // Check if sufficient balance exists
        if (amount <= balance) {
            // Process withdrawal
            balance -= amount;
            System.out.println("Withdrew RM " + String.format("%.2f", amount));
            
        } else {
            // Insufficient balance - throw exception with the shortage amount
            double shortfall = amount - balance;
            
            // IMPORTANT: Pass the shortage amount to exception
            // The catch block will use this data
            throw new InsufficientFundsException(shortfall);
        }
    }
}

/**
 * STEP 5: Business class - InventoryManager
 */
class InventoryManager {
    private int availableItems;
    
    public InventoryManager(int initialStock) {
        this.availableItems = initialStock;
    }
    
    public int getAvailableItems() {
        return availableItems;
    }
    
    /**
     * Process an order for items
     * 
     * @param quantity Number of items requested
     * @throws OutOfStockException if insufficient inventory
     */
    public void processOrder(int quantity) throws OutOfStockException {
        if (quantity <= availableItems) {
            availableItems -= quantity;
            System.out.println("Order processed: " + quantity + " units");
            
        } else {
            // Throw exception with both requested and available quantities
            throw new OutOfStockException(quantity, availableItems);
        }
    }
}
