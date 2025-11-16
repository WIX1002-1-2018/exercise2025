package W05;
import java.util.Scanner;

/**
 * W05E04C - Input Validation with Do-While Loop
 * Demonstrates: Using do-while loop for input validation with attempt counting
 * 
 * Key Concepts:
 * - Do-while loop (executes at least once, then checks condition)
 * - Input validation pattern
 * - Counting loop iterations
 * - User-friendly error messages
 * 
 * Algorithm:
 * 1. Initialize counter for number of attempts
 * 2. Do-while loop:
 *    a. Read user input
 *    b. If input is invalid (<=0), prompt again
 *    c. Increment attempt counter
 *    d. Repeat while input is invalid
 * 3. Display valid input and number of attempts
 * 
 * Note: Do-while is ideal here because we need to read input at least once
 * before we can validate it.
 * 
 * @author Badrul Anuar
 */
// Class name updated to match the file name: W05E04C
public class W05E04C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number:");
        int a;      // Variable to store user input
        int b = 0;  // Counter for number of inputs

        // Loop until the user enters a positive number
        do {
            a = sc.nextInt(); // Read user input
            if (a <= 0) {
                // If input is not positive, prompt again
                System.out.print("Please enter a positive number:");
            }
            b++; // Increment the counter for each input attempt
        } while (a <= 0); // Continue loop while input is invalid

        // Print the valid positive number entered
        System.out.printf("You entered: %d\n", a);
        // Print how many times the user entered a number
        System.out.printf("You have entered %d times\n", b);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}