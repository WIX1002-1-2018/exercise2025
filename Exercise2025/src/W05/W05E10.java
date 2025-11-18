package W05;

import java.util.Scanner;

/**
 * W05E10 - Number Triangle Pattern Generator
 * Demonstrates: Using nested loops to create a triangular number pattern
 * 
 * Key Concepts:
 * - Nested loops for pattern generation
 * - Incrementing pattern (each row has more numbers)
 * - Row number determines number of elements to print
 * - Sequential number printing within each row
 * 
 * Algorithm:
 * 1. Get number of days (N) from user
 * 2. Outer loop (i): iterates from 1 to N (controls rows)
 * 3. Inner loop (j): iterates from 1 to i (controls columns in each row)
 * 4. Print numbers sequentially in each row
 * 5. Move to next line after completing each row
 * 
 * Example Output (N=4):
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 
 * @author Ng Shao Ern
 */
public class W05E10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days (N): ");
        int N = sc.nextInt();

        // Outer loop: controls the number of rows (i = row number)
        for (int i = 1; i <= N; i++) { 
            // Inner loop: prints numbers from 1 to current row number
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println(); // Move to next line after each row
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
    
}
