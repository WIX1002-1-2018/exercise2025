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
public class W09E03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream("integer.dat"));
            Random random = new Random();
            for(int i = 0; i < 10; i++) {
                dos.writeInt(random.nextInt(1001));
            }
            dos.close();
        } catch(IOException e) {
            System.out.println("File not found" + e.getMessage());
        }
    }
    
}
