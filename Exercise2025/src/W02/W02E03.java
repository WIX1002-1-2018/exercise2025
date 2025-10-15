/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W02;

/**
 *
 * @author Badrul
 */
public class W02E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          System.out.println("--- Arithmetic Operators ---");
        int a = 10;
        int b = 3;
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division (integer result)
        System.out.println("a % b = " + (a % b)); // Modulo (remainder)

        System.out.println("\n--- Postfix vs. Prefix Operators ---");
        int x = 5;
        // Postfix: y gets the value of x (5), then x becomes 6.
        int y = x++;
        System.out.println("Postfix (y = x++): y is " + y + ", x is now " + x);

        int m = 5;
        // Prefix: m becomes 6, then n gets the new value of m (6).
        int n = ++m;
        System.out.println("Prefix (n = ++m): n is " + n + ", m is now " + m);
    }
    
}
