/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W03;

/**
 *
 * @author pensyarah
 */
public class W03E05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String S1 = "Hello World";
        String S2 = "Hello World";
        
        System.out.println(S1 + " " + S2);
        
        if(S1.equals(S2))
            System.out.println("Both String are equal");
        
        String S3 = "Hello Universe";
        
        if(S1.equals(S3))
            System.out.println("Both String are equal");
        else
            System.out.println("Both String are NOT equal");
        
        String S4 = "HELLO UNIVERSE";
        
        if(S3.equalsIgnoreCase(S4))
            System.out.println("Both String are equal");
        else
            System.out.println("Both String are NOT equal");
        
        
    }
    
}
