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
public class W03T04a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.print("Please enter five numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int b = input.nextInt();
        int a = input.nextInt();


        int Max = x;
        if (y > Max)
            Max = y;
        if (z > Max)
            Max = z;
        if (b > Max)
            Max = b;
        if (a > Max)
            Max = a;

        System.out.println("Largest number is " + Max);


    }
    
}
