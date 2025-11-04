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
public class W04E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 04: Sum numbers until -1 is entered (sentinel value)
        // Problem: Keep asking for numbers and sum them until user enters -1
        // The -1 is a sentinel value that signals the end of input
        // Example:
        //   Enter a number = 2
        //   Enter a number = 4
        //   Enter a number = -1 (stop, don't include -1 in sum)
        //   Total number enter is 3 and the sum is 6.

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

            // Continue loop while number is NOT -1
            // Exit loop when user enters -1 (the sentinel value)
        } while(number != -1);

        // Display the results
        System.out.println("Total number enter is " + count + " and the sum is " + sum);

        // Key Points:
        // 1. Sentinel value (-1) is used to signal end of input
        // 2. The sentinel value is included in the count but affects the sum
        // 3. This is a common pattern for reading unknown number of inputs
        // 4. To exclude -1 from sum, use: sum -= number; after the loop
    }
    
}
