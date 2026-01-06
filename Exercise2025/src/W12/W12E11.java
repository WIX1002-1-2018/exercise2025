package W12;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

/**
 * W12E11 - Interface Implementation and Polymorphism
 *
 * CONTEXT: Continuation of W10/W11 (classes, subclasses, inheritance, polymorphism).
 * LEARNING OBJECTIVES:
 * - Implement interfaces for consistent behavior across different classes
 * - Use polymorphism with interface types
 * - Combine interface implementation with method overloading
 */
public class W12E11 {

    public static void main(String[] args) {
        // Input data: product type and price
        String products = "BOOK 50.0\nELECTRONIC 200.0\nBOOK 30.0";
        ProductE11[] inventory = new ProductE11[10];
        int count = 0;

        // Try-with-resources: automatically closes Scanner and PrintWriter
        try (Scanner scanner = new Scanner(products);
             PrintWriter writer = new PrintWriter("W12E11_invoice.txt")) {
            
            // Set locale for consistent number parsing (US format)
            scanner.useLocale(Locale.US);

            // Parse input tokens and create product objects
            while (scanner.hasNext() && count < inventory.length) {
                String type = scanner.next();
                
                if (scanner.hasNextDouble()) {
                    double price = scanner.nextDouble();
                    // Create appropriate product based on type
                    if ("BOOK".equalsIgnoreCase(type)) {
                        inventory[count++] = new BookE11(price);
                    } else if ("ELECTRONIC".equalsIgnoreCase(type)) {
                        inventory[count++] = new ElectronicE11(price);
                    }
                }
            }

            // Process invoice with polymorphism
            writer.println("Invoice:");
            double total = 0;
            
            for (int i = 0; i < count; i++) {
                // Call interface method calculatePrice() - resolved at runtime
                double itemPrice = inventory[i].calculatePrice();
                writer.println(inventory[i].getDescription() + ": $" + 
                               String.format(Locale.US, "%.2f", itemPrice));
                
                // Call overloaded calculatePrice with discount
                double discounted = inventory[i].calculatePrice(0.1);
                writer.println("  With 10% discount: $" + 
                               String.format(Locale.US, "%.2f", discounted));
                
                total += itemPrice;
            }
            
            writer.println("\nTotal: $" + String.format(Locale.US, "%.2f", total));
            System.out.println("Invoice saved to W12E11_invoice.txt");
            
        } catch (Exception e) {
            System.out.println("Error processing products: " + e.getMessage());
        }
    }
}

// Interface defining behavior for products
interface ProductE11 {
    // Calculate the price (must be implemented by all classes)
    double calculatePrice();
    
    // Overloaded version with discount parameter
    double calculatePrice(double discountRate);
    
    // Get product description
    String getDescription();
}

// Concrete class implementing ProductE11 interface - Book
class BookE11 implements ProductE11 {
    private final double basePrice;

    BookE11(double basePrice) {
        this.basePrice = basePrice;
    }

    // IMPLEMENTS calculatePrice() from interface
    @Override
    public double calculatePrice() {
        // Books have 5% tax
        return basePrice * 1.05;
    }

    // IMPLEMENTS overloaded calculatePrice with discount
    @Override
    public double calculatePrice(double discountRate) {
        // Apply discount first, then tax
        return basePrice * (1 - discountRate) * 1.05;
    }

    // IMPLEMENTS getDescription() from interface
    @Override
    public String getDescription() {
        return "Book (base: $" + String.format(Locale.US, "%.2f", basePrice) + ")";
    }
}

// Concrete class implementing ProductE11 interface - Electronic device
class ElectronicE11 implements ProductE11 {
    private final double basePrice;

    ElectronicE11(double basePrice) {
        this.basePrice = basePrice;
    }

    // IMPLEMENTS calculatePrice() from interface
    @Override
    public double calculatePrice() {
        // Electronics have 15% tax
        return basePrice * 1.15;
    }

    // IMPLEMENTS overloaded calculatePrice with discount
    @Override
    public double calculatePrice(double discountRate) {
        // Apply discount first, then tax
        return basePrice * (1 - discountRate) * 1.15;
    }

    // IMPLEMENTS getDescription() from interface
    @Override
    public String getDescription() {
        return "Electronic (base: $" + String.format(Locale.US, "%.2f", basePrice) + ")";
    }
}
