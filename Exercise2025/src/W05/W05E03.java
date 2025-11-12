package W05;

import java.util.Scanner;

/**
 * W05E03 - String Input Validation with While Loop
 * Demonstrates: Validating user input and using break statement with strings
 * 
 * Key Concepts:
 * - String comparison using equals() method
 * - Input validation with error messages
 * - Break statement to exit loop
 * - Handling multiple conditions with if-else if-else
 * 
 * @author Badrul Anuar
 */
public class W05E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        
        // Infinite loop - continues until user enters "no"
        while (true) {
            System.out.print("Do you want to continue? (yes/no): ");
            input = sc.nextLine();
            
            // Check if user wants to stop
            if (input.equals("no")) {
                break; // Exit the loop
            } else if (input.equals("yes")) {
                // Continue the loop - no action needed
            } else {
                // Invalid input - prompt user to enter correct value
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        
        System.out.println("Program ended.");
        sc.close();
    }
}