/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class W10T04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Payment cash = new Payment(5000);
        Payment cheque = new Payment(5000, "35");
        Payment credit = new Payment(5000,"John","Visa","25/5",2342);
    }
    
}
