/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah add a new file
 */
public class W10T05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection p1 = new Connection();
        p1.displayInfo();
        
        Connection p2 = new Connection();
        p2.displayInfo();
        p2.disconnection();
        
        Connection p3 = new Connection();
        p3.displayInfo();
    }
    
}

