/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

/**
 *
 * @author pensyarah
 */
public class W05T07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int f1 = 1, f2 = 1;
        
        System.out.println("First 10 Fibonacci numbers: ");
        System.out.print(f1 + ", " + f1);
        
        for (int i = 3; i <= n; i++){
            int next = f1 + f2;
            System.out.print(", " + next);
            
            f1 = f2;
            f2 = next;
        }
    }
    
}
