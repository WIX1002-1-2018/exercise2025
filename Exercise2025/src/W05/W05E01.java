/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author jites
 */
public class W05E01 {
    public static void main(String args[]){
        int i = 1;
        for (i = 1; i <= 20; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        i = 1;
        do { 
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        } while (i <= 20);
        i = 1;
        
        while (i <= 20){
            if (i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }

    }
    
}
