package W05;

import java.util.Scanner;
/**
 * W05E11 - Prime Key Validator
 * Demonstrates: Input validation, prime number checking, and loop control
 *
 * Key Concepts:
 * - While loop for repeated input until valid
 * - Prime number checking using a for loop
 * - Boolean flags for validation
 * - User feedback for invalid input (too small or not prime)
 *
 * Algorithm:
 * 1. Loop until a valid key is entered
 * 2. Prompt user for a key (integer)
 * 3. If key <= 50, print "Invalid Key: Too Small"
 * 4. If key > 50, check if it is prime:
 *    a. If not prime, print "Invalid Key: Not Prime"
 *    b. If prime, print "Valid Key" and exit loop
 *
 * @author chua1
 */
public class W05E11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean invalid = true;
        int key; 
        while (invalid)
        {
            System.out.print("Enter key: ");
            key = input.nextInt();
            if (key > 50)
            {
                boolean prime = true;
                for (int i = 2; i < key; i++)
                {
                    if (key % i == 0)
                    {
                        prime = false;
                        System.out.println("Invalid Key: Not Prime");
                        break;
                    }
                }
                if (prime)
                {
                    System.out.print("Valid Key");
                    invalid = false;
                }            
            }
            else
            {
                System.out.println("Invalid Key: Too Small");
            }
            System.out.println(" ");
        }
        input.close(); // Close scanner to prevent resource leak
    }
}
