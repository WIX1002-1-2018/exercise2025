/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
public class W06E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] number = {0,1,2,3,4,5,6,7};
        
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);
        System.out.println(number[7]);
        
        int i=5;
        System.out.println(number[i]);
        
        System.out.println("Using Loop");
        for(i=0;i<number.length;i++)
            System.out.print(number[i] +  " ");
    }
    
}
