/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

import java.util.Scanner;

/**
 *
 * @author pensyarah
 */
public class W04E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               // TODO code application logic here
        //Enter a number = 2
        //Enter a number = 4
        //Enter a number = -11
        //Total number enter is 3 and the sum is 7.
        Scanner input = new Scanner(System.in);
        int number;
        int sum=0;
        int count=0;
        
        do{
            System.out.print("Enter a number : ");
            number = input.nextInt();
            sum += number;
            count++;
        }while(number != -1);
        
        System.out.println("Total number enter is " + count + " and the sum is " +sum);
    }
    
}
