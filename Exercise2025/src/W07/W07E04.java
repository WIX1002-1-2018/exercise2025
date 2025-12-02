/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

/**
 *
 * @author pensyarah
 */
public class W07E04 {

    /**
     * @param args the command line arguments
     */
    
    public static void mynewMethod(String country){
        System.out.println("Hello world " + country);
    }
    
    public static void mynewMethod2(String day,String country){
        System.out.println("Good " + day + " " + country);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        mynewMethod("Malaysia");
        mynewMethod("India");
        mynewMethod("China");
        
        mynewMethod2("Morning", "Malaysia");
        mynewMethod2("Evening", "Malaysia");
        
    }
    
}
