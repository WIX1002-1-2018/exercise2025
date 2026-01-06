package W12;

/**
 * W12E17 - Inner Classes: Nested, Static Nested, Local, and Anonymous
 *
 * CONTEXT: Capstone exercise on advanced OOP patterns with inner classes.
 * LEARNING OBJECTIVES:
 * - Understand different types of inner classes
 * - Use nested classes for logical grouping and encapsulation
 * - Use static nested classes for utility classes
 * - Use local classes for method-specific implementations
 * - Use anonymous classes for one-time implementations
 * - Understand access to outer class members from inner classes
 */
public class W12E17 {

    public static void main(String[] args) {
        System.out.println("=== INNER CLASSES OVERVIEW ===\n");
        
        // ===== 1. NESTED CLASSES (Non-static Inner Class) =====
        System.out.println("1. NON-STATIC INNER CLASS (Member Inner Class):");
        System.out.println("   - Has access to outer class members (including private)");
        System.out.println("   - Must be instantiated through an outer class instance");
        System.out.println("   - Maintains implicit reference to outer instance\n");
        
        BankAccountE17 account = new BankAccountE17("John Doe", 1000.0);
        System.out.println("  Account created: " + account);
        
        // Create inner class instance through outer class instance
        BankAccountE17.Transaction transaction = account.new Transaction("Deposit", 500.0);
        System.out.println("  Transaction (inner class): " + transaction);
        System.out.println();
        
        // ===== 2. STATIC NESTED CLASSES =====
        System.out.println("2. STATIC NESTED CLASS:");
        System.out.println("   - Does NOT have access to outer class instance members");
        System.out.println("   - Can access outer class static members");
        System.out.println("   - Acts like a regular class, but namespaced");
        System.out.println("   - Can be instantiated without outer class instance\n");
        
        // Create static nested class instance (no outer instance needed)
        BankAccountE17.Address address = new BankAccountE17.Address("123 Main St", "Springfield", "IL");
        System.out.println("  Address (static nested class): " + address);
        System.out.println();
        
        // ===== 3. LOCAL CLASSES =====
        System.out.println("3. LOCAL CLASS (Defined inside method):");
        System.out.println("   - Defined within a method");
        System.out.println("   - Scope limited to the method");
        System.out.println("   - Can access method parameters and local variables (must be effectively final)");
        System.out.println("   - Useful for complex single-use logic\n");
        
        demonstrateLocalClass();
        System.out.println();
        
        // ===== 4. ANONYMOUS CLASSES =====
        System.out.println("4. ANONYMOUS CLASS (Inline class without name):");
        System.out.println("   - Defined and instantiated in one expression");
        System.out.println("   - No class name");
        System.out.println("   - Often used with interfaces for callbacks/listeners");
        System.out.println("   - Common in event handling and functional programming\n");
        
        demonstrateAnonymousClass();
        System.out.println();
        
        // ===== PRACTICAL EXAMPLE: Validation Rules =====
        System.out.println("\n=== PRACTICAL EXAMPLE: Validator with Anonymous Classes ===\n");
        
        String email = "user@example.com";
        String password = "SecurePass123";
        
        // Use anonymous classes as validators
        Validator emailValidator = new Validator() {
            @Override
            public boolean isValid(String input) {
                return input.contains("@") && input.contains(".");
            }
            
            @Override
            public String getErrorMessage() {
                return "Invalid email format";
            }
        };
        
        Validator passwordValidator = new Validator() {
            @Override
            public boolean isValid(String input) {
                return input.length() >= 8 && input.matches(".*[A-Z].*") && input.matches(".*[0-9].*");
            }
            
            @Override
            public String getErrorMessage() {
                return "Password must be 8+ chars with uppercase and number";
            }
        };
        
        System.out.println("Email '" + email + "': " + 
                           (emailValidator.isValid(email) ? "VALID" : emailValidator.getErrorMessage()));
        System.out.println("Password '" + password + "': " + 
                           (passwordValidator.isValid(password) ? "VALID" : passwordValidator.getErrorMessage()));
        
        System.out.println("\n=== KEY DIFFERENCES ===\n");
        System.out.println("Non-static Inner Class:");
        System.out.println("  - Accessible: OuterClass.InnerClass innerObj = outerObj.new InnerClass()");
        System.out.println("  - Access to outer instance: Can use 'this' to refer to inner, 'OuterClass.this' for outer");
        System.out.println("  - Use case: Representing parts of outer object\n");
        
        System.out.println("Static Nested Class:");
        System.out.println("  - Accessible: OuterClass.NestedClass nestedObj = new OuterClass.NestedClass()");
        System.out.println("  - No access to outer instance (only static members)");
        System.out.println("  - Use case: Logical grouping, helper classes\n");
        
        System.out.println("Local Class:");
        System.out.println("  - Defined inside a method, only accessible within that method");
        System.out.println("  - Can access method parameters (must be final/effectively final)");
        System.out.println("  - Use case: Complex single-use implementations\n");
        
        System.out.println("Anonymous Class:");
        System.out.println("  - Inline, no name, one-time instantiation");
        System.out.println("  - Common with interfaces (implements single interface)");
        System.out.println("  - Use case: Event handlers, callbacks, simple interface implementations");
    }
    
    // Method demonstrating LOCAL CLASSES
    static void demonstrateLocalClass() {
        final int maxAttempts = 3;
        int attempt = 0;
        
        // Local class: defined within this method
        class LoginAttempt {
            String username;
            boolean successful;
            
            LoginAttempt(String username, boolean successful) {
                this.username = username;
                this.successful = successful;
            }
            
            String getStatus() {
                // Can access final method parameters and local variables
                return "Attempt " + maxAttempts + " - User: " + username + 
                       " - Status: " + (successful ? "SUCCESS" : "FAILED");
            }
        }
        
        // Use the local class
        LoginAttempt login1 = new LoginAttempt("admin", true);
        LoginAttempt login2 = new LoginAttempt("user", false);
        
        System.out.println("  " + login1.getStatus());
        System.out.println("  " + login2.getStatus());
    }
    
    // Method demonstrating ANONYMOUS CLASSES
    static void demonstrateAnonymousClass() {
        // Create anonymous implementation of Runnable interface
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("  Anonymous class: Running background task");
            }
        };
        
        task.run();
    }
}

// ============================================================================
// 1. NON-STATIC INNER CLASS EXAMPLE
// ============================================================================

class BankAccountE17 {
    private String accountHolder;
    private double balance;
    
    public BankAccountE17(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    
    @Override
    public String toString() {
        return accountHolder + " - Balance: $" + balance;
    }
    
    // NON-STATIC INNER CLASS: Has access to outer class members
    class Transaction {
        String type;
        double amount;
        
        Transaction(String type, double amount) {
            this.type = type;
            this.amount = amount;
        }
        
        @Override
        public String toString() {
            // Can access outer class members directly
            return type + " of $" + amount + " for account: " + accountHolder;
        }
    }
    
    // ========== STATIC NESTED CLASS ==========
    // Does NOT have access to outer instance members
    static class Address {
        String street;
        String city;
        String state;
        
        Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        
        @Override
        public String toString() {
            return street + ", " + city + ", " + state;
        }
    }
}

// ============================================================================
// INTERFACE FOR ANONYMOUS CLASS EXAMPLE
// ============================================================================

interface Validator {
    // Check if input is valid
    boolean isValid(String input);
    
    // Get error message if invalid
    String getErrorMessage();
}
