/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 0-10 = the number is in between 0-10
        // 11-20 the number is between 11-20
        // 20 the value is larger than 20
        
        int number = 85;
        
        if (number >= 0 && number <= 10)
            System.out.println("the number is in between 0-10");
        else if (number > 10 && number <=20)
            System.out.println("the number is between 11-20");
        else
            System.out.println("the value is larger than 20");
    }
    
}
