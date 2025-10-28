/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 05: String comparison using equals() and equalsIgnoreCase() methods
        // This demonstrates how to compare strings in Java

        // Create two String variables with the same content
        String S1 = "Hello World";
        String S2 = "Hello World";

        // Print both strings concatenated together
        System.out.println(S1 + " " + S2);

        // Use equals() method to compare two strings (case-sensitive)
        // equals() returns true if both strings have exactly the same content
        if(S1.equals(S2))
            System.out.println("Both String are equal");

        // Create a third string with different content
        String S3 = "Hello Universe";

        // Compare S1 and S3 using equals() method
        // This will be false because "Hello World" != "Hello Universe"
        if(S1.equals(S3))
            System.out.println("Both String are equal");
        else
            System.out.println("Both String are NOT equal");

        // Create a fourth string with the same content as S3 but in uppercase
        String S4 = "HELLO UNIVERSE";

        // Use equalsIgnoreCase() method to compare strings (case-insensitive)
        // equalsIgnoreCase() returns true if both strings have the same content, ignoring case differences
        // "Hello Universe" equals "HELLO UNIVERSE" when ignoring case
        if(S3.equalsIgnoreCase(S4))
            System.out.println("Both String are equal");
        else
            System.out.println("Both String are NOT equal");

        // Key difference:
        // equals() - case-sensitive comparison
        // equalsIgnoreCase() - case-insensitive comparison
    }
    
}
