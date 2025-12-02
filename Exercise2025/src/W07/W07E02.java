package W07;

import java.util.Random;

/**
 * W07E02 - 2D Sales Table & Maximum Finder
 * Demonstrates: Filling a 5x7 table (sizes x days) with random sales and
 * determining the highest single-day sales entry.
 *
 * Table Layout:
 * - Rows: 5 shoe sizes (6..10)
 * - Columns: 7 days (Mon..Sun)
 *
 * Key Concepts:
 * - 2D array traversal (nested for loops)
 * - Tracking maximum while generating data
 * - Parallel array for day names
 * - Avoiding magic numbers by deriving indices from array lengths
 *
 * @author pensyarah
 */
public class W07E02 {
    public static void main(String[] args) {
        int [][] salesTable = new int[5][7];
        int highestSales = -1;          // start below possible min (0)
        int highestDayIndex = 0;
        int highestSize = 0;

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Random random = new Random();

        // Populate sales & track max
        for(int row = 0; row < salesTable.length; row++) {
            int size = 6 + row;
            for(int col = 0; col < days.length; col++) {
                int sales = random.nextInt(101); // 0..100
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
}
