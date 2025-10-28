/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 09: Ternary operator (? :) for conditional expressions and assignments
        // The ternary operator is a shorthand way to write simple if-else statements
        // Syntax: condition ? valueIfTrue : valueIfFalse

        // Declare variables
        int number01;  // Will store the result of ternary operator
        int number02 = 2;
        int number04 = 10;
        int number05 = 20;

        // ===== EXAMPLE 1: Ternary operator with assignment =====
        // Ternary operator: If number02 >= 0, assign number04 (10) to number01, otherwise assign number05 (20)
        // Since number02 = 2 (which is >= 0), number01 will be assigned 10
        number01 = number02 >= 0 ? number04 : number05;

        System.out.println(number01);  // Output: 10

        // ===== EXAMPLE 2: Ternary operator with different condition =====
        // Change number02 to a negative value
        number02 = -10;

        // Ternary operator: If number02 >= 0, assign number04 (10) to number01, otherwise assign number05 (20)
        // Since number02 = -10 (which is NOT >= 0), number01 will be assigned 20
        number01 = number02 >= 0 ? number04 : number05;
        System.out.println(number01);  // Output: 20

        // ===== EXAMPLE 3: Ternary operator in print statement =====
        // Set number02 back to a positive value
        number02 = 10;
        System.out.print("The last statement is : ");
        // Use ternary operator directly in println()
        // Since number02 = 10 (which is >= 0), this will print 10
        System.out.println(number02 >= 0 ? number04 : number05);  // Output: 10

        // ===== EXAMPLE 4: Ternary operator in string concatenation =====
        // Use ternary operator within string concatenation
        // Since number02 = 10 (which is >= 0), this will print 10
        System.out.print("The a single statement with condition : " + (number02 >= 0 ? number04 : number05));
        // Output: The a single statement with condition : 10

        // ===== EXAMPLE 5: Ternary operator with String values =====
        // Change number02 to a negative value
        number02 = -1;
        // Ternary operator can also return String values (not just numbers)
        // Since number02 = -1 (which is NOT >= 0), this will print "Hello Universe"
        System.out.print("\nThe a single statement with condition : " + (number02 >= 0 ? "Hello World" : "Hello Universe\n"));
        // Output: The a single statement with condition : Hello Universe

        // Key points about the ternary operator:
        // 1. Syntax: condition ? valueIfTrue : valueIfFalse
        // 2. It's a shorthand for simple if-else statements
        // 3. It can return any type of value (int, String, boolean, etc.)
        // 4. It can be used in assignments, print statements, or string concatenation
        // 5. Use parentheses to make it clear when using in complex expressions
    }
    
}
