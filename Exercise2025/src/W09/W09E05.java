/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Badrul
 */
public class W09E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            String str = "Hello World";
    byte[] bytes = str.getBytes();
    try {
                try (PrintWriter outputStream = new PrintWriter(new FileOutputStream ("dataBinary.txt"))) {
                    for (byte b : bytes) {
                        int val = b;
                        for (int i = 0; i < 8; i++) {
                            if( (val&128)==0)
                                outputStream.print("0");
                            else
                                outputStream.print("1");
                            val <<= 1;
                        }
                    }       }
    } catch (IOException e) {
        System.out.println("Problem with file output");
    }
    
    System.out.print("The sentence is :");
    
    try {
                try (Scanner inputStream = new Scanner(new FileInputStream ("dataBinary.txt"))) {
                    String temp, str1="";
                    if (inputStream.hasNext()) {
                        temp = inputStream.next();
                        for (int i = 0; i < temp.length()/8; i++) {
                            int a = Integer.parseInt(temp.substring(8*i,(i+1)*8), 2);
                            str1 += (char)(a);
                        }
                        System.out.println(str1);
                    }       
                }
    } catch (FileNotFoundException e) {
           System.out.println("File was not found");
    }




    }
    
}
