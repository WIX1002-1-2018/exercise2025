package W06;

/**
 * W06E06 - String Splitting to Array
 * Demonstrates: Converting comma-separated string to array
 * 
 * Key Concepts:
 * - String.split() method to break string into parts
 * - Delimiter character (comma in this case)
 * - Enhanced for-each loop for string arrays
 * - Processing CSV-like data
 * 
 * @author Tey Yong Zhun
 * @modified pensyarah
 */
public class W06E06{
    public static void main(String[] args) {
        // Comma-separated string (like CSV format)
        String str = "Ang,Tan,Fong,Ahmad,Ali";

        // Split string by comma, creates String array
        String[] names = str.split(",");

        // Enhanced for-each loop to print each name
        for (String name : names){
            System.out.println(name);
        }
        
    }
}