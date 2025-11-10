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
public class W03T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the year:");
    int year;
    year = input.nextInt();
    if (( year % 4 == 0 && year % 100 != 0 ) || ( year % 400 == 0 ))
        System.out.println(year + " is a leap year.");
    else
        System.out.println(year + " is not a leap year.");

    }
    
}
