/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
import java.util.Random;
public class W06T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        int number = rand.nextInt(256);
        System.out.print("Binary " + number + ":");
        int[]binary = new int[8];
        for(int i =7;i>=0;i--){
            binary[i]=number%2;
            number = number/2;
            
        }
        
        for(int bit:binary){
            System.out.print(bit);
        }
    }
    
}
