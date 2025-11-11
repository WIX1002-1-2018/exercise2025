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
public class W04E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 06: Sum numbers while they are OUTSIDE the range [50, 70]
        // Problem: Keep asking for numbers and sum them while the number is outside [50, 70]
        // Stop when a number is inside the range [50, 70]
        // Example:
        //   Enter a number = 30 (outside range, continue)
        //   Enter a number = 40 (outside range, continue)
        //   Enter a number = 60 (inside range, stop)
        //   Total number enter is 3 and the sum is 130.

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

            // Continue loop while AT LEAST ONE condition is true:
            // 1. number <= 50 (less than or equal to 50)
            // 2. number >= 70 (greater than or equal to 70)
            // Exit loop when number is inside the range [50, 70]
            // This is the OPPOSITE of Exercise 05 (uses OR instead of AND)
        } while(number <= 50 || number >= 70);

        // Display the results
        System.out.println("Total number enter is " + count + " and the sum is " + sum);

        // Key Points:
        // 1. Logical OR (||) requires AT LEAST ONE condition to be true
        // 2. This checks if number is OUTSIDE the range [50, 70]
        // 3. Loop continues while number is outside range, exits when inside range
        // 4. Comparison with Exercise 05: E05 uses AND (inside range), E06 uses OR (outside range)
        // 5. De Morgan's Law: NOT(A AND B) = (NOT A) OR (NOT B)
    }
    
}
