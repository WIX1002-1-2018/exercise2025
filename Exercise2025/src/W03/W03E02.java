/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 02: if-else if-else statements with logical operators (&&)
        // This demonstrates how to check multiple conditions and execute different code blocks

        // Test cases:
        // 0-10 = the number is in between 0-10
        // 11-20 = the number is between 11-20
        // 21+ = the value is larger than 20

        // Declare and initialize an integer variable
        int number = 85;

        // First condition: Check if number is between 0 and 10 (inclusive)
        // The && operator is a logical AND operator - both conditions must be true
        // number >= 0 AND number <= 10
        if (number >= 0 && number <= 10)
            System.out.println("the number is in between 0-10");

        // Second condition: If the first condition is false, check if number is between 11 and 20
        // This block only executes if the first if condition was false
        else if (number > 10 && number <= 20)
            System.out.println("the number is between 11-20");

        // Default case: If both previous conditions are false, execute this block
        // This handles all numbers greater than 20
        else
            System.out.println("the value is larger than 20");

        // In this case, number = 85, so the else block will execute
    }
    
}
