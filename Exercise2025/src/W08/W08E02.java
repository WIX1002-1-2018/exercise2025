package W08;

import java.util.Scanner;
import java.util.Locale;

/**
 * W08E02 - Inventory Management Menu System
 *
 * SCENARIO: Manage a simple product inventory with menu-driven operations.
 * COMBINES: W03 (switch statements), W04 (loops), W05 (string validation),
 *           W06 (arrays), W07 (methods), console I/O
 *
 * LEARNING OBJECTIVES:
 * - Use switch statements for menu selection
 * - Implement sentinel-based loops for menu interaction
 * - Manage parallel arrays (product names and quantities)
 * - Apply input validation at each step
 * - Use helper methods to organize code
 */
public class W08E02 {

    static String[] products = {"Laptop", "Mouse", "Keyboard", "Monitor", "USB Cable"};
    static int[] inventory = {5, 20, 15, 3, 50};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;
        while (running) {
            displayMenu();
            System.out.print("Select option: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.\n");
                sc.nextLine();
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayInventory();
                    break;
                case 2:
                    addStock(sc);
                    break;
                case 3:
                    removeStock(sc);
                    break;
                case 4:
                    searchProduct(sc);
                    break;
                case 5:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }

        sc.close();
    }

    static void displayMenu() {
        System.out.println("\n=== Inventory System ===");
        System.out.println("1. View All Products");
        System.out.println("2. Add Stock");
        System.out.println("3. Remove Stock");
        System.out.println("4. Search Product");
        System.out.println("5. Exit");
    }

    static void displayInventory() {
        System.out.println("\n=== Current Inventory ===");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i] + ": " + inventory[i] + " units");
        }
        System.out.println();
    }

    static void addStock(Scanner sc) {
        displayInventory();
        System.out.print("Enter product number (1-" + products.length + "): ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.\n");
            sc.nextLine();
            return;
        }

        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index < 0 || index >= products.length) {
            System.out.println("Invalid product number.\n");
            return;
        }

        System.out.print("Quantity to add: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.\n");
            sc.nextLine();
            return;
        }

        int quantity = sc.nextInt();
        if (quantity > 0) {
            inventory[index] += quantity;
            System.out.println("Added " + quantity + " units. New stock: " + inventory[index] + "\n");
        } else {
            System.out.println("Quantity must be positive.\n");
        }
    }

    static void removeStock(Scanner sc) {
        displayInventory();
        System.out.print("Enter product number (1-" + products.length + "): ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.\n");
            sc.nextLine();
            return;
        }

        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index < 0 || index >= products.length) {
            System.out.println("Invalid product number.\n");
            return;
        }

        System.out.print("Quantity to remove: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input.\n");
            sc.nextLine();
            return;
        }

        int quantity = sc.nextInt();
        if (quantity > inventory[index]) {
            System.out.println("Not enough stock. Available: " + inventory[index] + "\n");
        } else if (quantity > 0) {
            inventory[index] -= quantity;
            System.out.println("Removed " + quantity + " units. New stock: " + inventory[index] + "\n");
        } else {
            System.out.println("Quantity must be positive.\n");
        }
    }

    static void searchProduct(Scanner sc) {
        System.out.print("Enter product name (partial match OK): ");
        String search = sc.nextLine().toLowerCase();

        boolean found = false;
        System.out.println();
        for (int i = 0; i < products.length; i++) {
            if (products[i].toLowerCase().contains(search)) {
                System.out.println((i + 1) + ". " + products[i] + ": " + inventory[i] + " units");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found matching '" + search + "'");
        }
        System.out.println();
    }
}
