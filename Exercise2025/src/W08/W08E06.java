package W08;

import java.util.Scanner;
import java.util.Locale;

/**
 * W08E06 - Restaurant Bill Calculator
 *
 * SCENARIO: Calculate restaurant bill with tax, tip, and itemized breakdown.
 * COMBINES: W02 (arithmetic), W03 (conditionals), W04 (loops),
 *           W05 (validation), W07 (methods), formatting with Locale
 *
 * LEARNING OBJECTIVES:
 * - Perform calculations with floating-point numbers
 * - Use helper methods to organize logic
 * - Validate numeric input
 * - Use conditional logic for discounts and fee adjustments
 * - Format currency output consistently
 */
public class W08E06 {

    static final double TAX_RATE = 0.08;
    static final double DELIVERY_CHARGE = 2.50;
    static final double LARGE_ORDER_THRESHOLD = 50.0; // Orders >= $50 get free delivery

    static Locale usLocale = Locale.US;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(usLocale);

        System.out.println("=== Restaurant Bill Calculator ===\n");

        double subtotal = 0;
        int itemCount = 0;

        // Read menu items until user enters 0 or "done"
        System.out.println("Enter items (item price): or 'done' to finish:");
        System.out.println();

        while (true) {
            System.out.print("Item " + (itemCount + 1) + " name (or 'done'): ");
            String itemName = sc.nextLine().trim();

            if (itemName.equalsIgnoreCase("done") || itemName.isEmpty()) {
                break;
            }

            System.out.print("Price: $");

            if (!sc.hasNextDouble()) {
                System.out.println("Invalid price. Skipping.\n");
                sc.nextLine();
                continue;
            }

            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            if (price < 0) {
                System.out.println("Price cannot be negative. Skipping.\n");
                continue;
            }

            subtotal += price;
            itemCount++;
            System.out.println();
        }

        if (itemCount == 0) {
            System.out.println("No items ordered.");
            sc.close();
            return;
        }

        // Calculate charges
        double tax = calculateTax(subtotal);
        double delivery = calculateDelivery(subtotal);
        double subtotalWithDelivery = subtotal + delivery;
        double total = subtotalWithDelivery + tax;

        // Ask for tip
        System.out.print("Tip percentage (0, 15, 18, 20): ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input. Using 0% tip.");
            sc.nextLine();
        } else {
            double tipPercent = sc.nextDouble();
            if (tipPercent >= 0 && tipPercent <= 100) {
                double tip = (total * tipPercent) / 100.0;
                total += tip;
                System.out.println("Tip ("+tipPercent+"%): $" + formatCurrency(tip));
            }
        }

        // Display receipt
        System.out.println("\n=== RECEIPT ===");
        System.out.println("Subtotal: $" + formatCurrency(subtotal));

        if (delivery > 0) {
            System.out.println("Delivery: $" + formatCurrency(delivery));
        } else {
            System.out.println("Delivery: FREE (large order)");
        }

        System.out.println("Tax (" + String.format("%.0f", TAX_RATE * 100) + "%): $" +
                formatCurrency(tax));
        System.out.println("---");
        System.out.println("TOTAL: $" + formatCurrency(total));

        sc.close();
    }

    static double calculateTax(double subtotal) {
        return subtotal * TAX_RATE;
    }

    static double calculateDelivery(double subtotal) {
        if (subtotal >= LARGE_ORDER_THRESHOLD) {
            return 0; // Free delivery for large orders
        }
        return DELIVERY_CHARGE;
    }

    static String formatCurrency(double amount) {
        return String.format(usLocale, "%.2f", amount);
    }
}
