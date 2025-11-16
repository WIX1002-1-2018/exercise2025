
package W05;

import java.util.Scanner;

/**
 * W05E03B - Do-While Loop with Input Validation
 * Demonstrates: Using a flag variable to track input validity and provide custom prompts
 * 
 * Key Concepts:
 * - Boolean flag variable to track state
 * - equalsIgnoreCase() for case-insensitive string comparison
 * - Dynamic prompts based on input validity
 * - Input validation with user feedback
 * 
 * Note: This version provides different prompts based on whether the input was valid
 * 
 * @author LUO YANHAO
 */
public class W05E03B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        boolean isValidInput = true; // Flag to track if last input was valid
        
        // Loop continues until user enters "no" (case-insensitive)
        do {
            // Display different prompt based on whether last input was valid
            if (isValidInput) {
                System.out.print("Do you want to continue? (yes/no): ");
            } else {
                System.out.print("Please enter \"yes\" or \"no\": ");
            }
            
            str = input.next();
            
            // Update flag: if input is not "yes" (ignoring case), mark as invalid
            if (!str.equalsIgnoreCase("Yes")) {
                isValidInput = false;
            } else {
                isValidInput = true;
            }
            
            // Loop exits only when user enters "no" (case-insensitive)
        } while (!str.equalsIgnoreCase("No"));
        
        input.close();
    }
}
