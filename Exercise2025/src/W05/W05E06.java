/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author FATHIR
 */
import java.util.Scanner;
public class W05E06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enterethe length of side: ");
        int length = input.nextInt();
        char p = 'P';
       
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                System.out.print(p);
        }
            System.out.println("");
        }
    }
    
}
