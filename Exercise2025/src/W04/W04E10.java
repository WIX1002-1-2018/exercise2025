/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author Badrul
 */
public class W04E10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 10: Using labeled loops with break and continue
        // Labels allow you to break or continue from nested loops
        // Syntax: labelName: loop { ... }
        
        // ===== EXAMPLE 1: Labeled break in nested loop =====
        System.out.println("===== Example 1: Labeled break in nested loop =====");
        System.out.println("Find first pair (row, col) where row * col = 12:");
        
        // Label the outer loop
        outerLoop1:
        for (int row = 1; row <= 5; row++) {
            for (int col = 1; col <= 5; col++) {
                int product = row * col;
                
                // Check if product equals 12
                if (product == 12) {
                    System.out.println("Found: " + row + " * " + col + " = " + product);
                    break outerLoop1;  // Break out of BOTH loops (outer and inner)
                }
            }
        }
        System.out.println();
        
        // ===== EXAMPLE 2: Labeled continue in nested loop =====
        System.out.println("===== Example 2: Labeled continue in nested loop =====");
        System.out.println("Print multiplication table, skip entire row when row = 2:");
        
        // Label the outer loop
        outerLoop2:
        for (int row = 1; row <= 4; row++) {
            // Check if row equals 2
            if (row == 2) {
                System.out.println("Skipping row 2...");
                continue outerLoop2;  // Skip to next row (continue outer loop)
            }
            
            System.out.print("Row " + row + ": ");
            for (int col = 1; col <= 5; col++) {
                System.out.print((row * col) + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // ===== EXAMPLE 3: Multiple labeled loops =====
        System.out.println("===== Example 3: Multiple labeled loops =====");
        System.out.println("Find first number divisible by both 3 and 5 in 2D grid:");
        
        // Label the outer loop
        outerLoop3:
        for (int i = 1; i <= 3; i++) {
            // Label the inner loop
            innerLoop3:
            for (int j = 1; j <= 10; j++) {
                int number = i * 10 + j;
                
                // Check if divisible by both 3 and 5
                if (number % 3 == 0 && number % 5 == 0) {
                    System.out.println("Found: " + number + " (at position [" + i + "][" + j + "])");
                    break outerLoop3;  // Break out of both loops
                }
            }
        }
        System.out.println();
        
        // ===== EXAMPLE 4: Labeled break to exit specific loop =====
        System.out.println("===== Example 4: Labeled break to exit specific loop =====");
        System.out.println("Print grid, break inner loop when col = 3:");
        
        outerLoop4:
        for (int row = 1; row <= 3; row++) {
            System.out.print("Row " + row + ": ");
            
            innerLoop4:
            for (int col = 1; col <= 5; col++) {
                // Check if col equals 3
                if (col == 3) {
                    System.out.print("[BREAK] ");
                    break innerLoop4;  // Break only inner loop
                }
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // ===== EXAMPLE 5: Labeled continue to skip outer loop iteration =====
        System.out.println("===== Example 5: Labeled continue to skip outer loop iteration =====");
        System.out.println("Print grid, skip row when row = 2:");
        
        outerLoop5:
        for (int row = 1; row <= 4; row++) {
            // Check if row equals 2
            if (row == 2) {
                System.out.println("Row " + row + ": [SKIPPED]");
                continue outerLoop5;  // Skip to next row
            }
            
            System.out.print("Row " + row + ": ");
            for (int col = 1; col <= 5; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        // ===== EXAMPLE 6: Practical example - Search in 2D array =====
        System.out.println("===== Example 6: Practical example - Search in 2D array =====");
        System.out.println("Search for value 15 in 2D array:");
        
        int[][] array = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20}
        };
        
        int searchValue = 15;
        boolean found = false;
        
        searchLoop:
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                // Check if current element equals search value
                if (array[row][col] == searchValue) {
                    System.out.println("Found " + searchValue + " at position [" + row + "][" + col + "]");
                    found = true;
                    break searchLoop;  // Break out of both loops
                }
            }
        }
        
        if (!found) {
            System.out.println("Value " + searchValue + " not found in array");
        }
        System.out.println();
        
        // Key Points about labeled loops:
        // 1. Labels are identifiers followed by a colon (labelName:)
        // 2. Labels must be placed before a loop statement
        // 3. break labelName exits the labeled loop (and all inner loops)
        // 4. continue labelName skips to next iteration of labeled loop
        // 5. Useful for breaking/continuing from nested loops
        // 6. Without labels, break/continue only affect the innermost loop
        // 7. Labels make code more readable when dealing with nested loops
        // 8. Use labels sparingly - they can make code harder to follow
        // 9. Alternative: use methods or flags instead of labels
    }
    
}

