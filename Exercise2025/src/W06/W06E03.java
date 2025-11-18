package W06;

/**
 * W06E03 - Working with Large Arrays
 * Demonstrates: Creating larger arrays and accessing specific elements
 * 
 * Key Concepts:
 * - Array size can be any positive integer
 * - Array indexing starts at 0
 * - Last element is at index (size - 1)
 * - Uninitialized elements default to 0 for int arrays
 * 
 * @author pensyarah
 * @modified Badrul Anuar
 */
public class W06E03 {

    public static void main(String[] args) {
        // Create array with 100 elements (indices 0 to 99)
        int [] num = new int[100];
        
        // Set first element (index 0)
        num[0]=12;
        
        // Set last element (index 99)
        num[99]=89;
        
        // Display first and last elements
        System.out.println(num[0]);   // Prints 12
        System.out.println(num[99]);  // Prints 89
    }
    
}
