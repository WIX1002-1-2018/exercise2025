/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W09;

/**
 *
 * @author pensyarah
 */
import java.io.*;
import java.util.Random;
public class W09T01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            PrintWriter writer = new PrintWriter("integer.txt");
                
            Random rand = new Random();
            for(int i=0; i<10; i++){
                int num = rand.nextInt(1001);
                writer.println(num);
            }
            writer.close();
          //  System.out.println("Integer.txt has been created");
        }catch(FileNotFoundException e){
            System.out.println("Problem with the file");
        }
    }
 }
