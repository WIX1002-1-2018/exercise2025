/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author Badrul
 */
public class W03E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 08: Switch expressions as assignments and multiple case labels
        // This demonstrates how to use switch as an expression that returns a value

        // Declare and initialize an integer variable
        int number = 2;

        // Switch expression that returns a String value
        // The result of the switch expression is assigned to the 'output' variable
        // This is different from traditional switch statements which don't return values
        String output = switch (number) {
            // case 1: If number equals 1, return "Satu"
            case 1 -> "Satu";
            // case 2: If number equals 2, return "Dua"
            case 2 -> "Dua";
            // case 3: If number equals 3, return "Tiga"
            case 3 -> "Tiga";
            // default: If number doesn't match any case, return this message
            default -> "This program accepts the number from 1 to 3 only";
        }; // Note the semicolon here, as it's an assignment statement (not just a switch block)

        // Print the result of the switch expression
        System.out.println(output);  // Output: Dua

        // ===== MULTIPLE CASE LABELS =====
        // Declare and initialize a month variable
        int month = 12;

        // Switch expression that returns an integer value
        // This example demonstrates multiple case labels (comma-separated)
        // Multiple cases can share the same result
        int daysInMonth = switch (month) {
            // case 1, 3, 5, 7, 8, 10, 12: All these months have 31 days
            // Multiple case labels are separated by commas
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            // case 4, 6, 9, 11: These months have 30 days
            case 4, 6, 9, 11 -> 30;
            // case 2: February has 28 days (ignoring leap years for this example)
            case 2 -> 28;
            // default: If month is invalid (not 1-12), return 0
            default -> 0;
        };

        // Print the result
        System.out.println("Days: " + daysInMonth);  // Output: Days: 31

        // Key features demonstrated:
        // 1. Switch expressions return values (can be assigned to variables)
        // 2. Multiple case labels can be combined with commas
        // 3. Each case returns a value using the arrow syntax (->)
        // 4. The entire switch expression ends with a semicolon when used as an assignment
    }
    
}
