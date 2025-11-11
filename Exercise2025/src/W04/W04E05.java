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
public class W04E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 05: Sum numbers while they are in the range 50 < number <= 70
        // Problem: Keep asking for numbers and sum them while the number is in range (50, 70]
        // Stop when a number is outside this range
        // Example:
        //   Enter a number = 60 (in range, continue)
        //   Enter a number = 65 (in range, continue)
        //   Enter a number = 80 (outside range, stop)
        //   Total number enter is 3 and the sum is 205.

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

            // Continue loop while BOTH conditions are true:
            // 1. number > 50 (greater than 50)
            // 2. number <= 70 (less than or equal to 70)
            // Exit loop when number is outside the range (50, 70]
        } while(number > 50 && number <= 70);

        // Display the results
        System.out.println("Total number enter is " + count + " and the sum is " + sum);

        // Key Points:
        // 1. Logical AND (&&) requires BOTH conditions to be true
        // 2. Range checking: 50 < number <= 70
        // 3. Loop continues while number is in range, exits when outside range
        // 4. The first number outside the range is included in count and sum
    }
    
}
