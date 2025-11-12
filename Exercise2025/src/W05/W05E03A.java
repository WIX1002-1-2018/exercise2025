package W05;

import java.util.Scanner;

/**
 * W05E03A - Compact Do-While Loop with String Input
 * Demonstrates: Advanced do-while loop with inline assignment and case-insensitive comparison
 * 
 * Key Concepts:
 * - Do-while loop with inline variable assignment in condition
 * - equalsIgnoreCase() method for case-insensitive string comparison
 * - Negation operator (!) to reverse boolean condition
 * - Compact code style (advanced technique)
 * 
 * Note: This is a more compact version of W05E03B
 * 
 * @author LUO YANHAO
 */
public class W05E03A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        
        // Do-while loop with inline assignment and condition check
        // Loop continues until user enters "no" (case-insensitive)
        do {
            System.out.print("Do you want to continue? (yes/no): ");
            
            // Advanced: Assignment happens inside the condition
            // !(str=input.next()).equalsIgnoreCase("No") means:
            // 1. Read input and assign to str
            // 2. Check if str is NOT equal to "No" (ignoring case)
            // 3. If true, continue loop; if false, exit loop
        } while (!(str = input.next()).equalsIgnoreCase("No"));
        
        input.close();
    }
}
