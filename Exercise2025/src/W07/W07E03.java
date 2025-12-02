package W07;

import java.util.Random;

/**
 * W07E03 - Menu Driven 2D Array Demonstration
 * Purpose: Provide a simple text menu allowing the user to choose between
 *          two independent examples: (1) inventory status, (2) weekly sales max.
 *
 * Example 1 (run):
 *   - 2D array shape: [5][2]  => each row holds {size, stock}.
 *   - Sizes generated sequentially (6..10), stock random 0..10.
 *   - Classifies stock into: Out / Low / Available.
 *
 * Example 2 (run2):
 *   - 2D array shape: [5][7] => 5 sizes (6..10) x 7 days.
 *   - Random daily sales (0..100) generated for each size/day combination.
 *   - Tracks highest single-day sales while populating (one pass, no second scan).
 *
 * Key Concepts Highlighted:
 *   - 2D array indexing conventions: row-major loops.
 *   - Parallel metadata array (day names) instead of magic numbers.
 *   - Single-pass maximum tracking pattern.
 *   - Basic user input routing logic (menu selection).
 *   - Resource management via Scanner.close().
 *
 * Possible Extensions (not implemented):
 *   - Summaries per size / per day (totals / averages).
 *   - Validation & retry for menu input.
 *   - Persisting results or exporting to CSV.
 *
 * @author pensyarah
 */
public class W07E03 {
    /**
     * Example 1: Build a small inventory table and label stock availability.
     */
    static void run() {
        int [][] shoeInventory = new int[5][2];
        Random random = new Random();

        for(int i = 0; i < shoeInventory.length; i++) {
            shoeInventory[i][0] = 6 + i;
            shoeInventory[i][1] = random.nextInt(11);
        }

        for(int i = 0; i < shoeInventory.length; i++) {
            int size = shoeInventory[i][0];
            int stock = shoeInventory[i][1];
            String status;
            if (stock == 0)      status = "Out of Stock";
            else if (stock < 3)  status = "Low Stock";
            else                 status = "Available";
            System.out.println("Size " + size + ": " + status + " with " + stock  + " pairs");
        }
    }

    /**
     * Example 2: Generate a size x day sales matrix and report the highest entry.
     */
    static void run2() {
        int [][] salesTable = new int[5][7];
        int highestSales = -1;
        int highestDayIndex = 0;
        int highestSize = 0;
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Random random = new Random();

        for(int row = 0; row < salesTable.length; row++) {
            int size = 6 + row;
            for(int col = 0; col < days.length; col++) {
                int sales = random.nextInt(101);
                salesTable[row][col] = sales;
                if (sales > highestSales) {
                    highestSales = sales;
                    highestDayIndex = col;
                    highestSize = size;
                }
            }
        }
        System.out.println("Highest sales: Size " + highestSize + " (" + days[highestDayIndex] + ") with " + highestSales + " pairs");
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Select which method to run:");
        System.out.println("1 - Shoe Inventory");
        System.out.println("2 - Weekly Sales Table");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            run();
        } else if (choice == 2) {
            run2();
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}
