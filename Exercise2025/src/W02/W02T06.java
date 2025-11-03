/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.Scanner;

/**
 * Write a Java program that prints the circumference of a circle.
 * The input of the program is the diameter. Display the result in three decimal places.
 * Note: use Math.PI for π.
 */
public class W02T06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        // Declare a variable to store the user-provided diameter
        double diameter;

        // Validate that the next token is a number (double) before reading it
        // This avoids an exception if the user types non-numeric input
        if (input.hasNextDouble()) {
            diameter = input.nextDouble(); // Read the diameter value
        } else {
            // Handle invalid input and exit the program early
            System.out.println("Invalid input. Please enter a numeric diameter.");
            input.close();
            return;
        }

        // Compute the circumference using the formula C = π * d (diameter-based)
        // Math.PI provides a precise value for π
        double circumference = Math.PI * diameter; // C = πd

        // Display the result to three decimal places
        System.out.printf("Circumference: %.3f%n", circumference);

        input.close();
    }
}
