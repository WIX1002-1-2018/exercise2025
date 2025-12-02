package W07;

import java.util.Random;

/**
 * W07E01 - 2D Array Basic Inventory Example
 * Demonstrates: Using a 2D int array to store shoe sizes and stock counts.
 *
 * Structure:
 * - Row 0..4 represent 5 consecutive shoe sizes (start at 6).
 * - Column 0 stores the shoe size, column 1 stores current stock.
 *
 * Key Concepts:
 * - Declaring a 2D array: int[][] a = new int[rows][cols]
 * - Populating rows with related paired data (size & stock).
 * - Generating random integers (0–10) with Random.nextInt(11).
 * - Simple conditional classification (Out / Low / Available).
 *
 * Stock Status Rules:
 * - 0        -> Out of Stock
 * - 1..2     -> Low Stock
 * - >=3      -> Available
 *
 * @author pensyarah
 */
public class W07E01 {
    public static void main(String[] args) {
        int [][] shoeInventory = new int[5][2]; // [row][0]=size, [row][1]=stock
        Random random = new Random();

        // Populate size & random stock
        for(int i = 0; i < shoeInventory.length; i++) {
            shoeInventory[i][0] = 6 + i;          // sizes: 6..10
            shoeInventory[i][1] = random.nextInt(11); // stock: 0..10
        }

        // Display with status classification
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
}
