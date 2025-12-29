package W10;

/**
 * W10E06 - Complete Class with Getters and Setters
 * 
 * LEARNING OBJECTIVES:
 * - Create a complete, well-encapsulated class
 * - Practice using constructors, getters, and setters together
 * - Understand the full pattern of object-oriented design
 * 
 * JOURNAL:
 * A well-designed class follows this pattern:
 * 1. Private instance variables
 * 2. Constructor(s) to initialize objects
 * 3. Public getter methods for read access
 * 4. Public setter methods for write access (with validation)
 * 5. Other public methods for behavior
 * 
 * This is the foundation of good object-oriented programming!
 */

class Product {
    // 1. Private instance variables (data hiding)
    private String productId;
    private String name;
    private double price;
    private int quantity;
    
    // 2. Constructor to initialize the object
    public Product(String id, String n, double p, int q) {
        productId = id;
        name = n;
        setPrice(p);        // Use setter for validation
        setQuantity(q);     // Use setter for validation
    }
    
    // 3. Getter methods (Accessors) - provide read access
    public String getProductId() {
        return productId;
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    // 4. Setter methods (Mutators) - provide controlled write access
    public void setName(String n) {
        if (n != null && !n.trim().isEmpty()) {
            name = n;
        } else {
            System.out.println("Error: Product name cannot be empty!");
        }
    }
    
    public void setPrice(double p) {
        if (p >= 0) {
            price = p;
        } else {
            System.out.println("Error: Price cannot be negative!");
            price = 0.0;
        }
    }
    
    public void setQuantity(int q) {
        if (q >= 0) {
            quantity = q;
        } else {
            System.out.println("Error: Quantity cannot be negative!");
            quantity = 0;
        }
    }
    
    // 5. Other useful methods (behavior)
    public double getTotalValue() {
        return price * quantity;
    }
    
    public void addStock(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Added " + amount + " units. New quantity: " + quantity);
        }
    }
    
    public boolean sellProduct(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Sold " + amount + " units. Remaining: " + quantity);
            return true;
        } else {
            System.out.println("Error: Cannot sell " + amount + " units. Only " + quantity + " available.");
            return false;
        }
    }
    
    public void displayProductInfo() {
        System.out.println("\n=== Product Details ===");
        System.out.println("Product ID: " + getProductId());
        System.out.println("Name: " + getName());
        System.out.println("Price: $" + getPrice());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Total Value: $" + getTotalValue());
    }
}

public class W10E06 {
    public static void main(String[] args) {
        System.out.println("=== Creating a Product ===");
        Product laptop = new Product("P001", "Gaming Laptop", 1299.99, 50);
        laptop.displayProductInfo();
        
        System.out.println("\n=== Updating Product Information ===");
        laptop.setName("Gaming Laptop Pro");
        laptop.setPrice(1399.99);
        laptop.displayProductInfo();
        
        System.out.println("\n=== Stock Management ===");
        laptop.addStock(25);
        laptop.sellProduct(30);
        laptop.sellProduct(60);  // Should fail - not enough stock
        laptop.displayProductInfo();
        
        System.out.println("\n=== Testing Data Validation ===");
        laptop.setPrice(-100);      // Invalid
        laptop.setQuantity(-10);    // Invalid
        laptop.setName("");         // Invalid
        laptop.displayProductInfo();
        
        // KEY TAKEAWAY:
        // - A complete class has private variables, constructor, getters, setters, and methods
        // - This pattern ensures data protection and controlled access
        // - Validation in setters prevents invalid data
        // - Methods can use getters and setters internally
        // - This is proper object-oriented design!
    }
}
