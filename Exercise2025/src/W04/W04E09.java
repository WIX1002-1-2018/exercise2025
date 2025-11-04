/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author Badrul
 */
public class W04E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 09: Using continue statement to skip to next iteration
        // The continue statement skips the rest of the current iteration and jumps to the next iteration
        
        // ===== EXAMPLE 1: Continue in for loop =====
        System.out.println("===== Example 1: Continue in for loop =====");
        System.out.println("Print numbers 0-9, but skip 5:");
        
        // Loop from 0 to 9
        for (int i = 0; i < 10; i++) {
            // Check if i equals 5
            if (i == 5) {
                System.out.println("Skipping 5...");
                continue;  // Skip to next iteration (i = 6)
            }
            System.out.println("Number: " + i);
        }
        System.out.println();
        
        // ===== EXAMPLE 2: Continue to skip even numbers =====
        System.out.println("===== Example 2: Continue to skip even numbers =====");
        System.out.println("Print only odd numbers from 1-20:");
        
        for (int i = 1; i <= 20; i++) {
            // Check if i is even
            if (i % 2 == 0) {
                continue;  // Skip even numbers, go to next iteration
            }
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        // ===== EXAMPLE 3: Continue in while loop =====
        System.out.println("===== Example 3: Continue in while loop =====");
        System.out.println("Print numbers 0-9, but skip multiples of 3:");
        
        int i = 0;
        while (i < 10) {
            i++;
            
            // Check if i is divisible by 3
            if (i % 3 == 0) {
                System.out.println("Skipping " + i + " (multiple of 3)");
                continue;  // Skip to next iteration
            }
            System.out.println("Number: " + i);
        }
        System.out.println();
        
        // ===== EXAMPLE 4: Continue in nested loop =====
        System.out.println("===== Example 4: Continue in nested loop =====");
        System.out.println("Print multiplication table, but skip when product > 15:");
        
        for (int row = 1; row <= 3; row++) {
            System.out.print("Row " + row + ": ");
            
            for (int col = 1; col <= 10; col++) {
                int product = row * col;
                
                // Check if product is greater than 15
                if (product > 15) {
                    System.out.print("[SKIP] ");
                    continue;  // Skip to next column
                }
                System.out.print(product + " ");
            }
            System.out.println();  // New line after each row
        }
        System.out.println();
        
        // ===== EXAMPLE 5: Continue with condition =====
        System.out.println("===== Example 5: Continue with condition =====");
        System.out.println("Print numbers 1-20, skip multiples of 2 and 3:");
        
        for (int num = 1; num <= 20; num++) {
            // Skip if divisible by 2 or 3
            if (num % 2 == 0 || num % 3 == 0) {
                continue;  // Skip to next iteration
            }
            System.out.print(num + " ");
        }
        System.out.println("\n");
        
        // ===== EXAMPLE 6: Difference between break and continue =====
        System.out.println("===== Example 6: Difference between break and continue =====");
        System.out.println("Using break (stops at 5):");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                break;  // Exits the loop completely
            }
            System.out.print(j + " ");
        }
        System.out.println("\n");
        
        System.out.println("Using continue (skips 5):");
        for (int j = 1; j <= 10; j++) {
            if (j == 5) {
                continue;  // Skips only this iteration
            }
            System.out.print(j + " ");
        }
        System.out.println("\n");
        
        // Key Points about continue:
        // 1. continue skips the rest of the current iteration
        // 2. The loop continues with the next iteration
        // 3. In nested loops, continue only affects the innermost loop
        // 4. continue is useful for filtering or skipping certain values
        // 5. Often used with if statements to check skip conditions
        // 6. Can be used in for, while, and do-while loops
        // 7. Difference from break: break exits loop, continue skips to next iteration
    }
    
}

