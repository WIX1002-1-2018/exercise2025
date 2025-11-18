package W06;

import java.util.Random;
import java.util.Scanner;

/**
 * W06E09 - Linear Search in Array
 * Demonstrates: Searching for a specific value in an array
 * 
 * Key Concepts:
 * - Linear search algorithm
 * - Sequential array traversal
 * - User input for search value
 * - Early termination with return statement
 * - Reporting search results
 * 
 * Algorithm:
 * 1. Generate array with random numbers
 * 2. Prompt user for number to search
 * 3. Loop through array comparing each element
 * 4. If found, report position and exit
 * 5. If not found after checking all elements, report "Not found"
 * 
 * @author muhdnuqman
 */
public class W06E09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int[] a = new int[20];
        
        // Generate and display random numbers
        for (int i = 0; i < a.length; i++){
            a[i] = rng.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        
        // Get search value from user
        System.out.print("Enter number to search : ");
        int toFind = in.nextInt();
        
        // Linear search
        for (int i = 0; i < a.length; i++){
            if (toFind == a[i]){
                System.out.print("Found in position " + i);
                in.close();
                return;  // Exit immediately when found
            }
        }
        
        // Only reaches here if not found
        System.out.print("Not found!");
        in.close();
    }
}
