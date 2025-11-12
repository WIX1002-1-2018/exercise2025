package W05;

/**
 * W05E01 - Comparing Different Loop Types
 * Demonstrates: Three ways to print even numbers from 2 to 20 using different loops
 * 
 * Key Concepts:
 * - For loop: best when iteration count is known
 * - While loop: condition checked before loop body executes
 * - Do-while loop: condition checked after loop body executes (executes at least once)
 * - All three loops can produce the same output
 * 
 * @author jitesh1059
 * @modified Hafidz M Rizky
 */
public class W05E01 {
    public static void main(String[] args) {
        // Method 1: Using FOR loop
        System.out.println("Using FOR loop:");
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
        
        System.out.println(); // Blank line for separation
        
        // Method 2: Using WHILE loop
        System.out.println("Using WHILE loop:");
        int j = 2; // Initialize counter before loop
        while (j <= 20) { // Check condition before executing loop body
            System.out.println(j);
            j = j + 2; // Increment counter inside loop body
        }
        
        System.out.println(); // Blank line for separation
        
        // Method 3: Using DO-WHILE loop
        System.out.println("Using DO-WHILE loop:");
        int k = 2; // Initialize counter before loop
        do {
            System.out.println(k);
            k = k + 2; // Increment counter inside loop body
        } while (k <= 20); // Check condition after executing loop body
        
        // Summary:
        // - FOR loop: compact, all loop control in one line
        // - WHILE loop: condition checked first, may not execute at all
        // - DO-WHILE loop: executes at least once, then checks condition
    }
}