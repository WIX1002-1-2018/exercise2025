/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

/**
 *
 * @author pensyarah
 */
public class W07T02 {

    /**
     * @param args the command line arguments
     */
    public static void displayReverseOrder(int a, int b, int c) {
        if(a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if(a < c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if(b < c) {
            int temp = b;
            b = c;
            c = temp;
        }
        System.out.printf("%d %d %d\n",a, b, c );
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        displayReverseOrder(4, 10, 6);
    }
    
}
