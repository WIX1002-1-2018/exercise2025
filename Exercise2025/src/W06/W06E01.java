package W06;

/**
 * W06E01 - Basic Array Declaration and Initialization
 * Demonstrates: Creating arrays, accessing and modifying elements
 * 
 * Key Concepts:
 * - Array declaration with 'new' keyword: int[] number = new int[10]
 * - Array initialization with values: int[] array = {1, 2, 3}
 * - Accessing elements by index (0-based indexing)
 * - Modifying array elements
 * - Works with different data types (int, String, char, etc.)
 * 
 * @author pensyarah
 */
public class W06E01 {

    public static void main(String[] args) {
        // Creating an array with size 10 (elements are initialized to 0 by default)
        int [] number = new int[10];
        
        // Setting specific array elements
        number[1]=1;   // Index 1 gets value 1
        number[9]=10;  // Index 9 (last element) gets value 10
        
        // Accessing and printing array element
        System.out.println(number[9]);
        
        // Declaring and initializing array with values in one line
        int [] numberWithValue = {11,12,13,14,15};
        
        // Accessing elements
        System.out.println(numberWithValue[0]);  // Prints 11
        System.out.println(numberWithValue[1]);  // Prints 12
        
        // Modifying an array element
        numberWithValue[0]=54;
        
        // Values after modification
        System.out.println(numberWithValue[0]);  // Prints 54 (modified)
        System.out.println(numberWithValue[1]);  // Prints 12 (unchanged)
        
        // String arrays work the same way
        String [] stringWithValue = {"Zero","One","Two","Three","Four"};
        System.out.println(stringWithValue[2]);  // Prints "Two"
        stringWithValue[2]="Hello";              // Modify element
        System.out.println(stringWithValue[2]);  // Prints "Hello"
        
    }
    
}
