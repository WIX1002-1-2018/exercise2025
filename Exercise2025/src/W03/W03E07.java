package W03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Badrul
 */
public class W03E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Exercise 07: Modern switch expression (arrow syntax) vs. traditional switch statement
        // This demonstrates the new Java 14+ switch expression syntax and the older syntax

        // Declare and initialize an integer variable
        int number = 3;

        // ===== MODERN APPROACH (Java 14+) =====
        // Modern 'switch' expression using arrow syntax (->)
        // This is the recommended way to use switch in modern Java
        // Advantages: No need for 'break' statements, cleaner syntax
        switch (number) {
            // case 1: If number equals 1, execute this statement
            case 1 -> System.out.println("One");
            // case 2: If number equals 2, execute this statement
            case 2 -> System.out.println("Two");
            // case 3: If number equals 3, execute this statement
            case 3 -> System.out.println("Three");
            // default: If number doesn't match any case, execute this statement
            default -> System.out.println("This program accepts the number from 1 to 3 only");
        }

        // ===== TRADITIONAL APPROACH (Older Java versions) =====
        // Traditional 'switch' statement with 'break' statements
        // This syntax still works but is considered outdated
        // Note: 'break' is required to exit the switch block, otherwise execution continues to the next case
        switch (number) {
            // case 1: If number equals 1, execute this statement
            case 1:
               System.out.println("Satu");
               break;  // Exit the switch block
            // case 2: If number equals 2, execute this statement
            case 2:
               System.out.println("Dua");
               break;  // Exit the switch block
            // case 3: If number equals 3, execute this statement
            case 3:
               System.out.println("Tiga");
               break;  // Exit the switch block
            // default: If number doesn't match any case, execute this statement
            default:
               System.out.println("This program accepts the number from 1 to 3 only");
         }

        // Key differences:
        // Modern syntax (->): No break needed, cleaner, recommended for Java 14+
        // Traditional syntax (:): Requires break, more verbose, but still works
    }
    
}
