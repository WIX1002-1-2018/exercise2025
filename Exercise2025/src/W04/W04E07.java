/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W04E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 07: Sum numbers while they are in ranges [0, 10] OR [20, 30]
        // Problem: Keep asking for numbers and sum them while the number is in either range
        // Stop when a number is outside both ranges
        // Example:
        //   Enter a number = 5 (in range [0, 10], continue)
        //   Enter a number = 25 (in range [20, 30], continue)
        //   Enter a number = 15 (outside both ranges, stop)
        //   Total number enter is 3 and the sum is 45.

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Declare variables
        int number;      // Stores the current number entered by user
        int sum = 0;     // Accumulates the sum of all numbers
        int count = 0;   // Counts how many numbers were entered

        // do-while loop: Executes at least once, then checks condition
        do {
            // Prompt user to enter a number
            System.out.print("Enter a number : ");

            // Read the integer from user input
            number = input.nextInt();

            // Add the number to the sum
            sum += number;

            // Increment the count of numbers entered
            count++;

            // Continue loop while number is in EITHER range:
            // First condition: (number <= 10 && number >= 0)  - Range [0, 10]
            // Second condition: (number >= 20 && number <= 30) - Range [20, 30]
            // Exit loop when number is outside BOTH ranges
            // This demonstrates complex logical conditions with nested AND and OR
        } while((number <= 10 && number >= 0) || (number >= 20 && number <= 30));

        // Display the results
        System.out.println("Total number enter is " + count + " and the sum is " + sum);

        // Key Points:
        // 1. Complex conditions can combine multiple AND (&&) and OR (||) operators
        // 2. Parentheses clarify the order of operations
        // 3. First part: (number <= 10 && number >= 0) checks if in range [0, 10]
        // 4. Second part: (number >= 20 && number <= 30) checks if in range [20, 30]
        // 5. OR (||) between them means: accept if in EITHER range
        // 6. Loop continues while number is in at least one of the ranges
    }
    
}
