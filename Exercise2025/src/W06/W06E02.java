package W06;

/**
 * W06E02 - Array Traversal with Loops
 * Demonstrates: Accessing array elements individually vs using loops
 * 
 * Key Concepts:
 * - Individual element access by index
 * - Using variable as index
 * - Using for loop to traverse arrays
 * - The 'array.length' property
 * - Efficient array iteration
 * 
 * @author pensyarah
 */
public class W06E02 {

    public static void main(String[] args) {
        // Initialize array with values
        int [] number = {0,1,2,3,4,5,6,7};
        
        // Manual access - not efficient for large arrays
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);
        System.out.println(number[7]);
        
        // Using variable as index
        int i=5;
        System.out.println(number[i]);  // Prints number[5] = 5
        
        // Using loop - much more efficient
        System.out.println("Using Loop");
        for(i=0; i<number.length; i++)  // number.length gives size of array
            System.out.print(number[i] +  " ");

        // Using for-each loop
        System.out.println("\nUsing For-Each Loop");
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
    
}
