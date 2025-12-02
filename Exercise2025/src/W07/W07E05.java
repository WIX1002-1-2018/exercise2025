/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

/**
 *
 * @author pensyarah
 */
public class W07E05 {

    /**
     * @param args the command line arguments
     */
    static void countthis(int a, int b){
        int sum = a + b;
        System.out.println("Total is " + sum );
    }
    
    static int countThisinMain(int a, int b){
        return a+b;
    }
    
    static void checkAge(int age) {
        if (age < 18) {
          System.out.println("Access denied - You are not old enough!");
        } else {
          System.out.println("Access granted - You are old enough!");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        countthis(21,4);
        
        System.out.println("Total is :" + countThisinMain(2,6));
        checkAge(20);
    }
    
}
