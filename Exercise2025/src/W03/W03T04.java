/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W03T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter three number: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x >= y && x >= z)
            System.out.println(x + " is the largest number!");
        else if (y >= x && y >= z)        
            System.out.println(y + " is the largest number!");
        else if ( z>= x && z>=y)
            System.out.println(z + " is the largest number!");
        }
    
}
