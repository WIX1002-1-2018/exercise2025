/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.Scanner;

/**
 * Write a Java program that converts inches to meters.
 * Given: 1 inch = 2.54 centimeters.
 * Print the output in two decimal places.
 */
public class W02T07 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter inches: ");

        double inches;
        if (input.hasNextDouble()) {
            inches = input.nextDouble();
        } else {
            System.out.println("Invalid input. Please enter a numeric value for inches.");
            input.close();
            return;
        }

        // Convert inches to meters: 1 inch = 2.54 cm; 100 cm = 1 m
        double meters = inches * 2.54 / 100.0; // or inches * 0.0254

        // Display result to two decimal places
        System.out.printf("Meters: %.2f%n", meters);

        input.close();
    }
}
