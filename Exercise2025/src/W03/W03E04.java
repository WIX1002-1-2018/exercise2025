/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 04: Multiple conditions with if-else if-else and compound statements
        // This demonstrates how to use multiple conditions with multiple statements in each block

        // Declare and initialize an integer variable
        int number = 5;

        // First condition: Check if number is between 0 and 10 (inclusive)
        // If true, execute both statements inside the curly braces
        if (number >= 0 && number <= 10){
            System.out.println("the number is in between 0-10");
            System.out.println("The number is smaller than 10");
        }

        // Second condition: If the first condition is false, check if number is between 11 and 20
        // If true, execute both statements inside this block
        else if (number > 10 && number <= 20){
            System.out.println("the number is between 11-20");
            System.out.println("The number is Good");
        }

        // Default case: If both previous conditions are false, execute this block
        // This handles all numbers greater than 20
        else{
            System.out.println("the value is larger than 20");
            System.out.println("Any number will print this");
        }

        // In this case, number = 5, so the first if block will execute
        // Both statements in the first block will print
    }
    
}
