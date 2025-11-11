package W05;

import java.util.Scanner;

/**
 * W05E02A - Do-While Loop Example
 * Demonstrates: Using do-while loop to sum numbers until user enters 0
 * 
 * Key Concepts:
 * - Do-while loop: executes at least once before checking condition
 * - Sentinel value (0 to quit)
 * - Conditional addition (only add if not 0)
 * 
 * Difference from W05E02:
 * - Uses do-while instead of while(true) with break
 * - Condition checked at the end of loop
 */
public class W05E02A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int sum = 0; // Accumulator variable to store the total sum
        
        // Do-while loop: body executes at least once, then checks condition
        do {
            System.out.print("Enter a number (0 to quit): ");
            num = sc.nextInt();
            
            // Only add to sum if the number is not 0
            if (num != 0) {
                sum += num; // Equivalent to: sum = sum + num
            }
        } while (num != 0); // Continue loop while number is not 0
        
        // Display the final result
        System.out.println("The total sum is: " + sum);
        sc.close();
    }
}