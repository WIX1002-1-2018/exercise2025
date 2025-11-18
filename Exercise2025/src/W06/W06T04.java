package W06;

/**
 * W06T04 - Counting Word Occurrences in Array
 * Demonstrates: Searching and counting specific strings in a string array
 * 
 * Key Concepts:
 * - String array declaration and initialization
 * - Using equals() method for string comparison
 * - Counter variable to track occurrences
 * - Loop through array with conditional check
 * 
 * @author pensyarah
 * @modified Badrul Anuar
 */
public class W06T04 {

    public static void main(String[] args) {
        // Array with mixed content (numbers as strings and words)
        String[] str = {"123", "254", "the"};
      
        // Counter for occurrences of target word
        int count = 0;
        
        // Loop through array and count occurrences of "the"
        for(int i = 0; i < 3; i++){
            if (str[i].equals("the")){
                count = count + 1;
            }
        }
        
        System.out.println(count);  // Prints 1
    }
}
