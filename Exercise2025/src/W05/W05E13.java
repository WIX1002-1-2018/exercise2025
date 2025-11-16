package W05;
import java.util.Scanner;

/**
 * W05E13 - Christmas Tree Pattern Generator
 * Demonstrates: Complex nested loops for creating a Christmas tree with trunk
 * 
 * Key Concepts:
 * - Advanced nested loop patterns
 * - Arithmetic series for calculating dimensions
 * - Space and character positioning for symmetrical patterns
 * - Creating multi-part patterns (tree top + trunk)
 * 
 * Algorithm:
 * Part 1 - Tree Top (Pyramid):
 * 1. Calculate base length using formula: 1 + 2*(height-1)
 * 2. For each row from 1 to height:
 *    - Calculate leading spaces for centering
 *    - Calculate number of stars for that row
 *    - Print spaces then stars
 * 
 * Part 2 - Tree Trunk:
 * 1. Calculate trunk width (height/3 + 1, must be odd)
 * 2. Print 3 rows of trunk centered below tree
 * 
 * Example Output (height=5):
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *    ***
 *    ***
 *    ***
 * 
 * @author Muhd. Nuqman
 */
public class W05E13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tree height: ");
        int height = in.nextInt();
        
        // Calculate the base pyramid length using arithmetic series formula
        int baselength = 1 + 2 * (height - 1); // For height=5: 1+2*4=9
        int space, length;
        
        // ===== PART 1: Draw the tree top (pyramid) =====
        for (int i = 1; i <= height; i++){
            // Calculate leading spaces to center the row
            space = baselength / 2 + 1 - i;
            
            // Calculate number of stars for this row
            length = 1 + 2 * (i - 1);
            
            // Print leading spaces
            for (int j = 0; j < space; j++) System.out.print(" ");
            
            // Print stars
            for (int j = 0; j < length; j++) System.out.print("*");
            
            System.out.print("\n");
        }

        // ===== PART 2: Draw the tree trunk =====
        // Calculate trunk width (approximately 1/3 of height, must be odd)
        length = height/3 + 1;
        if (length % 2 == 0) length++; // Ensure trunk width is odd
        
        // Calculate spaces needed to center the trunk
        int a = (length - 1)/2 + 1;
        space = baselength / 2 + 1 - a;

        // Print 3 rows of trunk
        for (int i = 0; i < 3; i++){
            // Print leading spaces
            for (int j = 0; j < space; j++) System.out.print(" ");
            
            // Print trunk
            for (int j = 0; j < length; j++) System.out.print("*");
            
            System.out.print("\n");
        }
        in.close();
    }
}
