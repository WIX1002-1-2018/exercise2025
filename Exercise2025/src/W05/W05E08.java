package W05;

import java.util.Scanner;

/**
 * W05E08 - Finding Maximum and Minimum Values with Input Validation
 * Demonstrates: Using loops to find min/max values with validation
 * 
 * Key Concepts:
 * - Integer.MAX_VALUE and Integer.MIN_VALUE constants
 * - Finding maximum and minimum in a series of numbers
 * - Input validation within loops
 * - Conditional logic for data filtering
 * 
 * Algorithm:
 * 1. Initialize min to largest possible value (Integer.MAX_VALUE)
 * 2. Initialize max to smallest possible value (Integer.MIN_VALUE)
 * 3. Loop through user inputs
 * 4. Validate each input (0-100000 range)
 * 5. Update min/max only for valid inputs
 * 6. Display results
 * 
 * @author Badrul Anuar
 */
public class W05E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of scores to process
        System.out.print("How many scores will you enter?: ");
        int n = scanner.nextInt();

        // Initialize min to the largest possible value and max to the smallest
        // This ensures any valid input will update these values
        int minScore = Integer.MAX_VALUE; // Starts at 2,147,483,647
        int maxScore = Integer.MIN_VALUE; // Starts at -2,147,483,648

        // Loop through each score
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter score " + i + ": ");
            int score = scanner.nextInt();

            // Validate the score is within acceptable range (0-100000)
            if (score >= 0 && score <= 100000) {
                // Only update min/max if the score is valid
                
                // Check if current score is greater than current maximum
                if (score > maxScore) {
                    maxScore = score;
                }
                
                // Check if current score is less than current minimum
                if (score < minScore) {
                    minScore = score;
                }
            } else {
                // Invalid score - skip it and inform user
                System.out.println("Invalid score. Ignoring.");
            }
        }

        // Display the results
        System.out.println("Highest Valid Score: " + maxScore);
        System.out.println("Lowest Valid Score: " + minScore);
        
        scanner.close();
    }
}