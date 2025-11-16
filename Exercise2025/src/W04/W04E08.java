/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W04E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 08: Using break statement to exit a loop
        // The break statement immediately terminates the loop and continues with the next statement
        
        // ===== EXAMPLE 1: Break in for loop =====
        System.out.println("===== Example 1: Break in for loop =====");
        System.out.println("Print numbers 0-9, but stop when we reach 5:");
        
        // Loop from 0 to 9
        for (int i = 0; i < 10; i++) {
            // Check if i equals 5
            if (i == 5) {
                System.out.println("Found 5! Breaking out of loop...");
                break;  // Exit the loop immediately
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop ended.\n");
        
        // ===== EXAMPLE 2: Break in while loop =====
        System.out.println("===== Example 2: Break in while loop =====");
        System.out.println("Sum numbers until user enters 0:");
        
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        
        while (true) {  // Infinite loop
            System.out.print("Enter a number (0 to stop): ");
            int number = input.nextInt();
            
            // Check if user entered 0
            if (number == 0) {
                System.out.println("User entered 0. Breaking out of loop...");
                break;  // Exit the loop when user enters 0
            }
            
            sum += number;
            count++;
        }
        
        System.out.println("Total numbers: " + count);
        System.out.println("Sum: " + sum + "\n");
        
        // ===== EXAMPLE 3: Break in nested loop (breaks only inner loop) =====
        System.out.println("===== Example 3: Break in nested loop =====");
        System.out.println("Print multiplication table, but stop each row at 5:");
        
        for (int row = 1; row <= 3; row++) {
            System.out.print("Row " + row + ": ");
            
            for (int col = 1; col <= 10; col++) {
                // Check if col equals 5
                if (col == 5) {
                    System.out.print("[STOP] ");
                    break;  // Only breaks the inner loop, not the outer loop
                }
                System.out.print((row * col) + " ");
            }
            System.out.println();  // New line after each row
        }
        System.out.println();
        
        // ===== EXAMPLE 4: Break with condition =====
        System.out.println("===== Example 4: Break with condition =====");
        System.out.println("Find first number divisible by 7 between 1-100:");
        
        for (int i = 1; i <= 100; i++) {
            // Check if i is divisible by 7
            if (i % 7 == 0) {
                System.out.println("Found: " + i);
                break;  // Exit loop after finding the first match
            }
        }
        System.out.println();
        
        // Key Points about break:
        // 1. break immediately exits the current loop
        // 2. In nested loops, break only exits the innermost loop
        // 3. break is useful for early termination when a condition is met
        // 4. Often used with if statements to check exit conditions
        // 5. Can be used in for, while, and do-while loops
        // 6. Also used in switch statements (covered in W03)
    }
    
}

