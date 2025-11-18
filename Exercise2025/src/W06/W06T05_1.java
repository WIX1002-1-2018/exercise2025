package W06;

/**
 * W06T05_1 - Alternative String Reversal Methods
 * Demonstrates: Two different approaches to reverse strings in an array
 * 
 * Key Concepts:
 * - Method 1: Manual character iteration using charAt()
 * - Method 2: Using StringBuilder.reverse()
 * - Nested loops for character-level iteration
 * - Comparing different approaches to same problem
 * 
 * Comparison:
 * - Manual method: More code, shows understanding of string indexing
 * - StringBuilder: More concise, built-in functionality
 * 
 * @author Badrul Anuar
 * @modified pensyarah
 */
public class W06T05_1 {
    public static void main(String[] args) {
        String[] sentence = {"Hello", "world", "Java", "programming"};
        
        // Method 1: Manual reversal using charAt()
        System.out.println("Manual reversal:");
        for(int i=sentence.length-1; i>=0; i--){
            // Inner loop: iterate through each character backwards
            for(int j=sentence[i].length()-1; j>=0; j--)
                System.out.print(sentence[i].charAt(j));
            System.out.println();
        }

        // Method 2: Using StringBuilder (cleaner and more efficient)
        System.out.println("\nUsing StringBuilder:");
        for (int i = sentence.length - 1; i >= 0; i--) {
            StringBuilder sb = new StringBuilder(sentence[i]);
            System.out.println(sb.reverse());
        }

    }
}
