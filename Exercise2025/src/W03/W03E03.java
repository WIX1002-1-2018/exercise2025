/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 03: Compound statements within if blocks
        // This demonstrates how to execute multiple statements when a condition is true

        // Declare and initialize an integer variable
        int number = 15;

        // if statement with a compound block (multiple statements inside curly braces)
        // The == operator checks if two values are equal
        // If the condition is true, ALL statements inside the curly braces will execute
        if(number == 10){
            // First statement: Print a message
            System.out.println("The number is 10");
            // Second statement: Print another message
            // Both statements will only execute if number equals 10
            System.out.println("The number is larger than 5");
        }

        // In this case, number = 15, so the condition is false and neither statement will execute
        // Note: When using curly braces {}, you can have multiple statements in the if block
    }
    
}
