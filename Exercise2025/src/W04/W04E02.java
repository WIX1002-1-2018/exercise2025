/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author pensyarah
 */
public class W04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 02: Different approaches to print even numbers from 0 to 100
        // This demonstrates three different methods to achieve the same result

        // ===== METHOD 1: Using if statement with modulo operator =====
        // Initialize counter variable
        int number = 0;

        // Loop through numbers 0 to 99
        for(number = 0; number < 100; number++)
            // Check if number is even using modulo operator (%)
            // number % 2 == 0 means the number is divisible by 2 (even)
            if(number % 2 == 0)
                System.out.println("Number " + number);

        // ===== METHOD 2: Using post-increment in print statement =====
        // Reset counter to 0
        number = 0;

        // Loop through numbers 0 to 99
        for(number = 0; number < 100; number++)
            // Post-increment (number++) increments AFTER printing
            // This prints: 0, 1, 2, 3, ..., 99 (all numbers, not just even)
            System.out.println("Number (without if) " + number++);

        // ===== METHOD 3: Using increment by 2 in for loop =====
        // Reset counter to 0
        number = 0;

        // Loop with increment of 2 (number+=2)
        // This starts at 0 and increments by 2 each iteration: 0, 2, 4, 6, ..., 98
        for(number = 0; number < 100; number+=2)
            // This prints only even numbers without needing an if statement
            System.out.println("Number (without if and ++) " + number);

        // Key Points:
        // 1. Method 1: Uses if statement to filter even numbers
        // 2. Method 2: Prints all numbers (demonstrates post-increment behavior)
        // 3. Method 3: Most efficient - increments by 2 to skip odd numbers
    }
    
}
