/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
public class W06E04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [] charN = {'$', '%', '+', '-'};
        charN[2] = '*';
        System.out.println(charN[2]);
        
        for(int i=0;i<charN.length;i++)
            System.out.print(charN[i] + " ");
    }
    
}
