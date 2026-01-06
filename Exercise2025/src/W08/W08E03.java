package W08;

import java.util.Scanner;
import java.util.Locale;

/**
 * W08E03 - Sales Analysis Dashboard
 *
 * SCENARIO: Analyze weekly sales data from a 2D array, calculate totals and averages.
 * COMBINES: W06 (2D arrays), W04 (nested loops), W03 (conditionals),
 *           W05 (string analysis), formatting with Locale
 *
 * LEARNING OBJECTIVES:
 * - Work with 2D arrays to represent structured data (rows = products, cols = days)
 * - Use nested loops to traverse and analyze 2D data
 * - Find maximum/minimum values across multiple dimensions
 * - Calculate row and column totals
 * - Format output for clarity
 */
public class W08E03 {

    public static void main(String[] args) {
        // Sales data: 4 products, 7 days (Monday to Sunday)
        int[][] sales = {
            {120, 150, 180, 140, 200, 300, 250},  // Product A
            {80, 90, 110, 95, 130, 180, 160},     // Product B
            {200, 220, 210, 230, 250, 280, 270},  // Product C
            {45, 50, 60, 55, 75, 100, 90}         // Product D
        };

        String[] products = {"Product A", "Product B", "Product C", "Product D"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        // Display header
        System.out.println("=== Weekly Sales Report ===\n");
        displaySalesTable(sales, products, days);

        // Calculate and display statistics
        System.out.println("\n=== Product Statistics ===");
        displayProductStats(sales, products);

        System.out.println("\n=== Daily Statistics ===");
        displayDailyStats(sales, days);

        System.out.println("\n=== Overall Summary ===");
        displayOverallStats(sales, products, days);
    }

    static void displaySalesTable(int[][] sales, String[] products, String[] days) {
        // Header row
        System.out.printf("%-12s", "");
        for (String day : days) {
            System.out.printf("%-12s", day);
        }
        System.out.println("Total");

        // Data rows
        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%-12s", products[i]);
            int rowTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-12d", sales[i][j]);
                rowTotal += sales[i][j];
            }
            System.out.println(rowTotal);
        }
    }

    static void displayProductStats(int[][] sales, String[] products) {
        for (int i = 0; i < sales.length; i++) {
            int sum = 0;
            int max = sales[i][0];
            int min = sales[i][0];

            for (int j = 0; j < sales[i].length; j++) {
                sum += sales[i][j];
                if (sales[i][j] > max) max = sales[i][j];
                if (sales[i][j] < min) min = sales[i][j];
            }

            double average = (double) sum / sales[i].length;
            System.out.println(products[i] + ":");
            System.out.println("  Total: " + sum + " | Average: " +
                    String.format(Locale.US, "%.1f", average) +
                    " | Max: " + max + " | Min: " + min);
        }
    }

    static void displayDailyStats(int[][] sales, String[] days) {
        for (int day = 0; day < days[0].length(); day++) { // This was intended to be days.length but fixing logic
            // Actually, let's use proper logic for 7 days
        }

        // Correct approach: iterate through each day column
        for (int j = 0; j < 7; j++) {
            int sum = 0;
            int max = sales[0][j];
            int min = sales[0][j];

            for (int i = 0; i < sales.length; i++) {
                sum += sales[i][j];
                if (sales[i][j] > max) max = sales[i][j];
                if (sales[i][j] < min) min = sales[i][j];
            }

            double average = (double) sum / sales.length;
            System.out.println(days[j] + ":");
            System.out.println("  Total: " + sum + " | Average: " +
                    String.format(Locale.US, "%.1f", average) +
                    " | Max: " + max + " | Min: " + min);
        }
    }

    static void displayOverallStats(int[][] sales, String[] products, String[] days) {
        int grandTotal = 0;
        int globalMax = sales[0][0];
        int globalMin = sales[0][0];
        String maxProduct = products[0];
        String maxDay = days[0];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                grandTotal += sales[i][j];
                if (sales[i][j] > globalMax) {
                    globalMax = sales[i][j];
                    maxProduct = products[i];
                    maxDay = days[j];
                }
                if (sales[i][j] < globalMin) {
                    globalMin = sales[i][j];
                }
            }
        }

        int totalDays = sales.length * sales[0].length;
        double overallAverage = (double) grandTotal / totalDays;

        System.out.println("Grand Total Sales: " + grandTotal);
        System.out.println("Overall Average: " + String.format(Locale.US, "%.1f", overallAverage));
        System.out.println("Highest Sale: " + globalMax + " (" + maxProduct + " on " + maxDay + ")");
        System.out.println("Lowest Sale: " + globalMin);
    }
}
