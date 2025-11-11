package W05;

import java.util.Scanner;

/**
 * W05E04 - Input Validation with Do-While Loop
 * Demonstrates: Ensuring user enters valid positive numbers with retry counting
 * 
 * Key Concepts:
 * - Do-while loop for input validation
 * - Counter variable to track number of attempts
 * - Conditional prompts based on input validity
 * - Input validation: ensuring number is positive (> 0)
 */
public class W05E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
<<<<<<< HEAD
        int count = 0; // Counter to track number of attempts
        
        // Do-while loop ensures we get at least one input
        // Loop continues until user enters a positive number
=======
        int count = 0;
        System.out.print("Enter a positive nu");
        num = sc.nextInt();
>>>>>>> b51288b (message)
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
            count++; // Increment counter after each attempt
            
            // If number is not positive, display error message
            if (num <= 0) {
                System.out.println("Error: Number must be positive. Try again.");
            }
        } while (num <= 0); // Continue loop while number is not positive
        
        // Display the valid number entered
        System.out.println("You entered: " + num);
        System.out.println("You have entered " + count + " times.");
        
        sc.close();
    }
}
