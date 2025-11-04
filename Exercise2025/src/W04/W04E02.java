/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author pensyarah
 */
public class W04E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //generate a number from 0-100;
        int number =0;
        for(number = 0; number < 100; number++)
            if(number % 2 ==0)
                System.out.println("Number " + number);
        
        number =0;
        for(number = 0; number < 100; number++)
                System.out.println("Number (without if) " + number++);
        
        number =0;
        for(number = 0; number < 100; number+=2)
                System.out.println("Number (without if and ++) " + number);
    }
    
}
