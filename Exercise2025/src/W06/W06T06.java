/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

/**
 *
 * @author pensyarah
 */
import java.util.Random;
public class W06T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random random=new Random();
        int[] array=new int[20];
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(100);
            System.out.print(array[i]+" ");
        }
        
        System.out.println("\nBubble Sort");
        
        for (int j=1;j<array.length;j++){
            for (int k=0;k<array.length-1;k++){
                if (array[k]>array[k+1]){
                    int temp=array[k];
                    array[k]=array[k+1];
                    array[k+1]=temp;
                }
            }
        }
        
        for (int m=0;m<array.length;m++){
            System.out.print(array[m]+" ");
        }
    }   
}
