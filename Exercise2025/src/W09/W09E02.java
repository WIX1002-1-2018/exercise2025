/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W09;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author pensyarah
 */
public class W09E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner scan = new Scanner(new FileInputStream("integer.txt"));
            System.out.print("The list : ");
            int max = Integer.MIN_VALUE;
            while (scan.hasNextInt()){
                int number = scan.nextInt();
                if(number > max) {
                    max = number;
                }
                System.out.print(number + " ");
            }
            System.out.println("\nLargest number: " + max);
            scan.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
    
}
