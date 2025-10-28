/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number01;
        int number02 = 2;
        int number04 = 10;
        int number05 = 20;
        
        number01 = number02 >=0 ? number04 : number05;
        
        System.out.println(number01);
        
        number02 = -10;
        
        number01 = number02 >=0 ? number04 : number05;
        System.out.println(number01);
        
        number02 = 10;
        System.out.print("The last statement is : ");
        System.out.println(number02 >=0 ? number04 : number05);
        
        
        System.out.print("The a single statement with condition : " + (number02 >=0 ? number04 : number05));
        
        number02 = -1;
        System.out.print("\nThe a single statement with condition : " + (number02 >=0 ? "Hello World" : "Hello Universe\n"));
        
     
       // (number02 <= number01) ? System.out.println("") : System.out.println("");
        
               
    }
    
}
