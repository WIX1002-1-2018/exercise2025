/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author pensyarah
 */
public class W04E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 01: Comparing three types of loops (while, do-while, for)
        // This program demonstrates how all three loop types can produce the same output

        // ===== WHILE LOOP =====
        // Initialize counter variable
        int number = 0;

        // while loop: Checks condition BEFORE executing the loop body
        // Syntax: while (condition) { statements; }
        // The loop continues as long as number < 100
        while(number < 100){
            // Pre-increment (++number) increments BEFORE printing
            // So it prints 1, 2, 3, ..., 100
            System.out.println("Hello World (while)" + ++number);
        }

        // ===== DO-WHILE LOOP =====
        // Reset counter to 0
        number = 0;

        // do-while loop: Checks condition AFTER executing the loop body
        // Syntax: do { statements; } while (condition);
        // The loop body executes at least once, even if condition is false
        do{
            // Pre-increment (++number) increments BEFORE printing
            System.out.println("Hello World (Do-while) " + ++number);
        }while(number < 100);

        // ===== FOR LOOP =====
        // for loop: Most compact way to write loops with initialization, condition, and increment
        // Syntax: for (initialization; condition; increment) { statements; }
        // This loop initializes number=0, continues while number<100, increments by 1 each iteration
        for(number = 0; number < 100; number++)
            // Note: number is post-incremented in the for statement, so we add 1 to display 1-100
            System.out.println("Hello World (for) " + (number+1));

        // Key Differences:
        // 1. while: Checks condition first (may not execute if condition is false)
        // 2. do-while: Executes at least once, then checks condition
        // 3. for: Best for loops with known number of iterations
    }
    
}
