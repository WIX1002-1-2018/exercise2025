package W05;

import java.util.Scanner;

/**
 * W05E02 - While Loop with Break Statement
 * Demonstrates: Using while(true) loop with break to sum numbers until user enters 0
 * 
 * Key Concepts:
 * - Infinite loop: while(true)
 * - Break statement to exit loop
 * - Accumulator pattern (sum += num)
 * - Sentinel value (0 to quit)
 */
public class W05E02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0; // Accumulator variable to store the total sum
        
        // Infinite loop - will continue until break statement is executed
        while (true) {
            System.out.print("Enter a number (0 to quit): ");
            num = sc.nextInt();
            
            // Check if user wants to quit (sentinel value)
            if (num == 0) {
                break; // Exit the loop immediately
            }
            
            // Add the number to the running sum
            sum += num; // Equivalent to: sum = sum + num
        }
        
        // Display the final result
        System.out.println("The total sum is: " + sum);
        sc.close();
    }
}
