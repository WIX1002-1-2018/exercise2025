package W03;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Badrul
 */
public class W03E07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Modern 'switch' as an expression
        int number = 3;
        
        //new
        switch (number) {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            default -> System.out.println("This program accepts the number from 1 to 3 only");
        }
        
        //old - dont use this, but if you still want to use, yes you can no problem!!!!
        switch (number) {
            case 1:
               System.out.println("Satu"); 
               break;
            case 2:
               System.out.println("Dua");
               break;
            case 3:
               System.out.println("Tiga");
               break;
            default:
               System.out.println("This program accepts the number from 1 to 3 only");
         }

     
    }
    
}
