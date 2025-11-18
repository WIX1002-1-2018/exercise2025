package W06;

/**
 * W06T05 - Reversing Array Elements and Strings
 * Demonstrates: Iterating array in reverse and reversing each string
 * 
 * Key Concepts:
 * - Reverse iteration (from length-1 down to 0)
 * - StringBuilder class for string manipulation
 * - StringBuilder.reverse() method
 * - toString() to convert StringBuilder back to String
 * 
 * @author pensyarah
 * @modified Badrul Anuar
 */
public class W06T05 {

    public static void main(String[] args) {
        // Array of strings
        String[] sentence = {"my", "name", "is", "QIANFUSHENG"};
        
        // Iterate through array in reverse order
        for (int i = sentence.length - 1; i >=0; i--){
            // Reverse each string using StringBuilder
            String reversedString = new StringBuilder(sentence[i]).reverse().toString();
            System.out.println(reversedString);
        }
        // Output:
        // GNEHSUFNAIQ
        // si
        // eman
        // ym
    }
    
}
