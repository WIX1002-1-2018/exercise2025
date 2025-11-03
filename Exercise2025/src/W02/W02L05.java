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
public class W02L05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lab Exercise 05: Generate a random number and calculate the sum of its digits
        // Problem: Generate one random number in the range 0 to 10000
        // Display: The number and the sum of all digits in the number
        
        // Create a RandomGenerator using the default algorithm
        RandomGenerator random = RandomGenerator.getDefault();
        
        // Generate one random number between 0 and 10000 (inclusive)
        // nextInt(0, 10001) generates a random number from 0 to 10000
        int randomNumber = random.nextInt(0, 10001);
        
        // Display the random number
        System.out.println("===== Sum of Digits Calculator =====");
        System.out.println("Range: 0 to 10000");
        System.out.println();
        System.out.println("Random Number: " + randomNumber);
        System.out.println();
        
        // ===== METHOD 1: Using String conversion =====
        // Convert the number to a String to access individual digits
        String numberString = String.valueOf(randomNumber);
        
        // Initialize sum variable
        int sumOfDigits = 0;
        
        // Loop through each character (digit) in the string
        for (int i = 0; i < numberString.length(); i++) {
            // Get the character at position i
            char digitChar = numberString.charAt(i);
            
            // Convert the character to an integer digit
            // Character '0' has ASCII value 48, so we subtract '0' to get the numeric value
            int digit = digitChar - '0';
            
            // Add the digit to the sum
            sumOfDigits += digit;
        }
        
        // Display the sum of digits
        System.out.println("Digits in the number: " + numberString);
        System.out.println("Sum of all digits: " + sumOfDigits);
        System.out.println();
        
        // ===== METHOD 2: Using modulo and division (alternative approach) =====
        // This method extracts digits mathematically without converting to string
        int tempNumber = randomNumber;
        int sumOfDigits2 = 0;
        
        // Keep extracting digits until the number becomes 0
        while (tempNumber > 0) {
            // Get the last digit using modulo operator (%)
            // For example: 12345 % 10 = 5
            int lastDigit = tempNumber % 10;
            
            // Add the digit to the sum
            sumOfDigits2 += lastDigit;
            
            // Remove the last digit by dividing by 10
            // For example: 12345 / 10 = 1234
            tempNumber = tempNumber / 10;
        }
        
        // Display the result using the alternative method
        System.out.println("Verification using alternative method:");
        System.out.println("Sum of all digits: " + sumOfDigits2);
        System.out.println();
        
        // Display breakdown of digits (for numbers with multiple digits)
        if (randomNumber > 0) {
            System.out.println("Digit Breakdown:");
            String breakdown = "";
            for (int i = 0; i < numberString.length(); i++) {
                if (i > 0) {
                    breakdown += " + ";
                }
                breakdown += numberString.charAt(i);
            }
            System.out.println(breakdown + " = " + sumOfDigits);
        } else {
            System.out.println("Digit Breakdown: 0 = 0");
        }
    }
    
}

