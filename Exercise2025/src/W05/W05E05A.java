package W05;

import java.util.Scanner;

/**
 * W05E05A - Counting Even and Odd Numbers with While Loop
 * Demonstrates: Alternative approach to W05E05 using while loop instead of for loop
 * 
 * Key Concepts:
 * - While loop with manual counter increment
 * - Modulo operator (%) to determine if number is even or odd
 * - Counting even and odd numbers
 * 
 * Difference from W05E05:
 * - Uses while loop instead of for loop
 * - Manually manages loop counter
 * - Does not calculate sums (only counts)
 * 
 * @author Zahran
 */
public class W05E05A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersEntered;
        int number;
        int loopCount = 1; // Manual loop counter starting at 1
        int evenCount = 0; // Counter for even numbers
        int oddCount = 0;  // Counter for odd numbers
        
        // Get the total count of numbers to process
        System.out.print("How many numbers will you enter?: ");
        numbersEntered = input.nextInt();
        
        // While loop continues until we've processed all numbers
        while (loopCount <= numbersEntered) {
            System.out.print("Enter number " + loopCount + ": ");
            number = input.nextInt();
            
            // Check if number is even or odd using modulo operator
            if (number % 2 == 0) {
                // Even number: remainder is 0 when divided by 2
                evenCount++;
            } else {
                // Odd number: remainder is not 0 when divided by 2
                // Note: else if (number % 2 != 0) is redundant but explicit
                oddCount++;
            }
            
            loopCount++; // Manually increment the counter
        }
        
        // Display results
        System.out.println("\n--- Statistics ---");
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        
        input.close();
    }
}
