/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06;

/**
 *
 * @author yiren
 */
import java.util.Random;
public class W06E07 {
    public static void main(String[]args){
        Random rand = new Random();
        int[] num = new int[20];
        for(int i=0; i<num.length;i++){
            num[i] = rand.nextInt(100);
            System.out.print(num[i]+ " ");
        }
        for ( int pass = 1; pass < num.length; pass++ ){
            // control number of comparison
		for ( int i = 0; i < num.length - 1; i++ ) 
			if ( num[i] > num[ i + 1 ] )  {
               		int temp = num[i];        
				num[i] = num[i+1];  
				num[i+1] = temp;
			}
                
        } 
        System.out.println("\nBuuble Sort: ");
        for(int i=0; i<num.length;i++){
            
            System.out.print( num[i]+" ");
        }
                
         	
    }
}
