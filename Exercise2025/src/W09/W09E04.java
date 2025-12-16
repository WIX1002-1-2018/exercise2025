/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W09;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author pensyarah
 */
public class W09E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0;
        int count = 0;
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("integer.dat"));
            System.out.print("List of integers: ");
            try{
                while(true){
                int num = in.readInt();
                System.out.print(num + " ");
                count++;
                sum = sum + num;
             }
            }catch(EOFException e){
                System.out.println("");
           }
   
           System.out.printf("The average is %.2f\n", (double) sum/count);
           in.close(); 
            
        }catch(IOException e) {
            System.out.println("File not found");
        }
    }
    
}
