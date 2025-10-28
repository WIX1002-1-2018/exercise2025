/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 01: Basic if statements with comparison operators

        // Declare and initialize an integer variable
        int number = 10;

        // First if statement: Check if number is greater than or equal to 10
        // The >= operator is a comparison operator that returns true if the left side is greater than or equal to the right side
        if (number >= 10)
            System.out.println("The number Larger or equal to 10");

        // Second if statement: Check if number is less than 10
        // The < operator is a comparison operator that returns true if the left side is less than the right side
        // Note: Both if statements are independent; they are not connected with else
        if (number < 10)
            System.out.println("The number is smaller than 10");

        // In this case, only the first condition is true (10 >= 10), so only the first message will print
    }
    
}
