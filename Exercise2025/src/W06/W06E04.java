package W06;

/**
 * W06E04 - Character Arrays
 * Demonstrates: Working with char arrays, modifying and displaying elements
 * 
 * Key Concepts:
 * - Character arrays store single characters
 * - Array initialization with char literals
 * - Modifying array elements
 * - Traversing arrays with loops
 * 
 * @author Badrul Anuar
 * @modified pensyarah
 */
public class W06E04 {

    public static void main(String[] args) {
        // Initialize char array with special characters
        char [] charN = {'$', '%', '+', '-'};
        
        // Modify element at index 2 (change '+' to '*')
        charN[2] = '*';
        System.out.println(charN[2]);  // Prints '*'
        
        // Display all elements using loop
        for(int i=0; i<charN.length; i++)
            System.out.print(charN[i] + " ");  // Prints: $ % * - 
    }
    
}
