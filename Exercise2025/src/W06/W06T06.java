package W06;

import java.util.Random;

/**
 * W06T06 - Decimal to Binary Conversion
 * Demonstrates: Converting decimal number to 8-bit binary using array
 * 
 * Key Concepts:
 * - Decimal to binary conversion algorithm
 * - Using modulo (%) to get remainder
 * - Integer division (/) to reduce number
 * - Storing bits in array (reverse order)
 * - Enhanced for-each loop for display
 * 
 * Algorithm:
 * 1. Generate random number (0-255)
 * 2. Use modulo 2 to get last bit (0 or 1)
 * 3. Divide by 2 to remove last bit
 * 4. Repeat for 8 bits (store from right to left)
 * 5. Display all bits
 * 
 * @author pensyarah
 */
public class W06T06 {

    public static void main(String[] args) {
        Random rand = new Random();
        
        // Generate random number between 0-255
        int number = rand.nextInt(256);
        System.out.print("Binary " + number + ":");
        
        // Array to store 8 bits
        int[]binary = new int[8];
        
        // Convert decimal to binary (store from right to left)
        for(int i =7; i>=0; i--){
            binary[i] = number % 2;  // Get last bit (0 or 1)
            number = number / 2;      // Remove last bit
        }
        
        // Display binary number
        for(int bit:binary){
            System.out.print(bit);
        }
    }
    
}
