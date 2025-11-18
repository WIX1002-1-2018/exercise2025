/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

import java.util.Random;

/**
 *
 * @author User
 */
public class W06E07 {
    public static void main(String[] args) {
        int[] list = new int[20];
        Random random = new Random();
        int temp;
        
        for (int i = 0; i < list.length-1; i++) {
            list[i]= random.nextInt(100);
        }
        
        
        
        for (int i = 0; i < list.length; i++) {
            
            for (int j = 0; j < list.length -1; j++) {
                if (list[j]>list[j+1]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
                
        }
        }
        
        System.out.println("sorted:");
        for (int i = 0; i < list.length-1; i++) {
            
            System.out.println(list[i]);
        }
        
    }
}
