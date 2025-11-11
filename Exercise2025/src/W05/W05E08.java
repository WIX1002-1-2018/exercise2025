/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author Dzaky Arya
 */
import java.util.Scanner;
public class W05E08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many scores?");
        int scores = input.nextInt();
        int num;
        int low = 100000;
        int high = 0;
        int stop = 0;
        
        for(int i=1; i<=scores; i++){
            System.out.print("scores "+ i+": ");
            num = input.nextInt();
            if(num<0 || num>100000){
                System.out.println("~~invalid~~");
                System.out.println("Please enter numbers between 0 - 100.000");
                stop+=1;
                break;              
            }
            if(num<low){
                low = num;
            }
            if (num>high){
                high = num;
            }
            
        }
            if (stop ==0){
                System.out.println("Highest valid score: "+high);
                System.out.println("Lowest valid score: "+low);
        }
        
               
    }
            
    
}
