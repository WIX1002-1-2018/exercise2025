package W05;

import java.util.Scanner;

/**
 * W05E05 - Counting and Summing Even and Odd Numbers
 * Demonstrates: Using for loop to process multiple numbers and categorize them
 * 
 * Key Concepts:
 * - For loop with user-defined iteration count
 * - Modulo operator (%) to determine if number is even or odd
 * - Multiple counters and accumulators
 * - Conditional logic inside loops
 * 
 * Algorithm:
 * 1. Ask user how many numbers they will enter
 * 2. Loop through each number
 * 3. Determine if each number is even or odd using modulo
 * 4. Count and sum even and odd numbers separately
 * 5. Display statistics
 * 
 * @author IvanFong
 */
public class W05E05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, number;
        
        // Counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;
        
        // Accumulators for sum of even and odd numbers
        int sumOdd = 0;
        int sumEven = 0;
        
        // Get the total count of numbers to process
        System.out.print("How many numbers will you enter?: ");
        num = sc.nextInt();
        
        // Loop through each number
        for (int i = 1; i <= num; i++) {
            System.out.print("Enter number " + i + ": ");
            number = sc.nextInt();
            
            // Check if number is even or odd using modulo operator
            if (number % 2 == 0) {
                // Even number: remainder is 0 when divided by 2
                evenCount++;
                sumEven += number;
            } else {
                // Odd number: remainder is 1 when divided by 2
                oddCount++;
                sumOdd += number;
            }
        }
        
        // Display results
        System.out.println("\n--- Statistics ---");
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
        
        sc.close();
    }
}