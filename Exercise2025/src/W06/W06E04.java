/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

/**
 *
 * @author User
 */
public class W06E04 {
    public static void main(String[] args) {
        
        char [] symbol ={'$','%','+','-'};
        symbol[2] ='*';

        System.out.println("Using Loop");
        int i;
        for(i=0;i<symbol.length;i++){
            System.out.print(symbol[i]+ " ");
        }
    }
    
}
