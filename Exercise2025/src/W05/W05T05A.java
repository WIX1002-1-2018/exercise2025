/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

/**
 *
 * @author pensyarah
 */
public class W05T05A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 25;
        float sum = 0;
        
        for (int i = 1; i <= 25; i++){
            a++;
            b--;
            sum += (float) a / b;
        }
        System.out.printf("%.2f", sum);
    }
  }
    

