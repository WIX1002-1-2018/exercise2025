/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

import java.util.random.RandomGenerator;

/**
 *
 * @author Badrul
 */
public class W02L03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lab Exercise 03: Generate three random numbers and calculate sum and average
        // Problem: Generate three random numbers in the range 10 to 50
        // Display: The three numbers, their sum, and their average (2 decimal places)
        
        // Create a RandomGenerator using the default algorithm
        RandomGenerator random = RandomGenerator.getDefault();
        
        // Generate three random numbers between 10 and 50 (inclusive)
        // nextInt(origin, bound) generates a random number from origin (inclusive) to bound (exclusive)
        // So nextInt(10, 51) generates numbers from 10 to 50
        int number1 = random.nextInt(10, 51);
        int number2 = random.nextInt(10, 51);
        int number3 = random.nextInt(10, 51);
        
        // Calculate the sum of the three numbers
        int sum = number1 + number2 + number3;
        
        // Calculate the average of the three numbers
        // Cast to double to get decimal places in the result
        double average = (double) sum / 3;
        
        // Display the results
        System.out.println("===== Random Number Generator =====");
        System.out.println("Range: 10 to 50");
        System.out.println();
        
        // Display the three random numbers
        System.out.println("Three Random Numbers:");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
        System.out.println();
        
        // Display the sum
        System.out.println("Sum: " + sum);
        
        // Display the average with 2 decimal places
        // Using printf() with format specifier %.2f for 2 decimal places
        System.out.printf("Average: %.2f%n", average);
        
        // Alternative way to display average with 2 decimal places:
        // System.out.println("Average: " + String.format("%.2f", average));
    }
    
}

