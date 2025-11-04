/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W04;

/**
 *
 * @author pensyarah
 */
public class W04E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        while(number < 100){
            System.out.println("Hello World (while)" + ++number);
          //  number++;
        }
        
        number = 0;
        do{
            System.out.println("Hello World (Do-while) " + ++number);
          //  number++;
        }while(number < 100);
        
              ;
        for(number = 0;number < 100; number++)
            System.out.println("Hello World (for) " + (number+1));
          //  number++;
      
     
    }
    
}
