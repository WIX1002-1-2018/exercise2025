/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

/**
 *
 * @author pensyarah
 */

public class W07L01 {
    public static void multiPrint(int n,char c){
        for(int i=0;i<n;i++){
            System.out.print(c);
        }
    }
    public static void main(String[] args) {
        int size = 5;
        
        System.out.println("Triangle");
        for(int i=1;i<=size;i++){
            multiPrint(i,'*');
        }
        
        System.out.println("Diamonds");
        for(int i=1;i<=size;i++){
            multiPrint(size-i,' ');
            multiPrint(2*i-1,'*');
            System.out.println();
        }
        for(int i=size-1;i>=1;i--){
            multiPrint(size-i,' ');
            multiPrint(2*i-1,'*');
            System.out.println();
        }
        
        
        
    }
    
}
