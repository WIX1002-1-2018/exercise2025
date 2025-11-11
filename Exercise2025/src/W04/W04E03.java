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
public class W04E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 03: Sum numbers until an odd number is entered
        // Problem: Keep asking for numbers and sum them while the number is EVEN
        // Stop when an ODD number is entered
        // Example:
        //   Enter a number = 2 (even, continue)
        //   Enter a number = 4 (even, continue)
        //   Enter a number = 1 (odd, stop)
        //   Total number enter is 3 and the sum is 7.

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

            // Continue loop while number is EVEN (number % 2 == 0)
            // Exit loop when an ODD number is entered (number % 2 != 0)
        } while(number % 2 == 0);

        // Display the results
        System.out.println("Total number enter is " + count + " and the sum is " + sum);

        // Key Points:
        // 1. do-while ensures at least one number is entered
        // 2. Modulo operator (%) checks if number is even or odd
        // 3. Loop continues while condition is true, exits when condition becomes false
    }
    
}
