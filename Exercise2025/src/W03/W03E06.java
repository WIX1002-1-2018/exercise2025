/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 06: String comparison using compareTo() method
        // This demonstrates lexicographic (dictionary order) string comparison

        // Create string variables
        String S1 = "A";
        String S2 = "B";
        String S3 = "F";
        String S4 = "C";
        String S5 = "AA";

        // compareTo() method returns:
        // - Negative number if the first string comes before the second string (alphabetically)
        // - Zero if both strings are equal
        // - Positive number if the first string comes after the second string (alphabetically)

        // S1 ("A") compared to S2 ("B"): A comes before B, so result is negative (-1)
        System.out.println(S1.compareTo(S2));  // Output: -1

        // S1 ("A") compared to S3 ("F"): A comes before F, so result is negative (-5)
        System.out.println(S1.compareTo(S3));  // Output: -5

        // S1 ("A") compared to S4 ("C"): A comes before C, so result is negative (-2)
        System.out.println(S1.compareTo(S4));  // Output: -2

        // S3 ("F") compared to S4 ("C"): F comes after C, so result is positive (3)
        System.out.println(S3.compareTo(S4));  // Output: 3

        // S1 ("A") compared to S5 ("AA"): "A" is a prefix of "AA", so result is negative (-1)
        System.out.println(S1.compareTo(S5));  // Output: -1

        // Create two more strings for comparison
        String S6 = "AF";
        String S7 = "AC";

        // S6 ("AF") compared to S7 ("AC"): Both start with "A", but F comes after C, so result is positive (3)
        System.out.println(S6.compareTo(S7));  // Output: 3

        // Key points:
        // - compareTo() performs lexicographic (alphabetical) comparison
        // - It compares character by character from left to right
        // - It is case-sensitive (uppercase letters come before lowercase in ASCII)
    }
    
}
