package W05;

import java.util.Scanner;

/**
 * W05E06 - Nested Loops for Square Pattern
 * Demonstrates: Using nested for loops to create a square pattern of characters
 * 
 * Key Concepts:
 * - Nested loops: outer loop for rows, inner loop for columns
 * - Pattern printing using loops
 * - Character output in grid format
 * - Loop iteration control for 2D structures
 * 
 * Algorithm:
 * 1. Get square size from user
 * 2. Outer loop controls rows (vertical)
 * 3. Inner loop controls columns (horizontal)
 * 4. Print character for each position
 * 5. Move to next line after each row
 * 
 * @author FATHIR
 */
public class W05E06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Get the size of the square from user
        System.out.print("Enter the length of side: ");
        int length = input.nextInt();
        
        // Character to print in the pattern
        char pattern = 'P';
        
        // Outer loop: controls rows (runs 'length' times)
        for (int i = 0; i < length; i++) {
            
            // Inner loop: controls columns (runs 'length' times per row)
            for (int j = 0; j < length; j++) {
                System.out.print(pattern); // Print character without newline
            }
            
            // After completing one row, move to next line
            System.out.println();
        }
        
        input.close();
    }
}
