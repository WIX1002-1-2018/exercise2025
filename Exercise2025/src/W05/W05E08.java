/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;
import java.util.Scanner;
/**
 *
 * @author pensyarah
 */
public class W05E08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String word1 = scanner.nextLine();
        
        for ( int i = word1.length() - 1; i >= 0; i--){
            System.out.print(word1.charAt(i));
        }
        System.out.println();
    }
    
}
