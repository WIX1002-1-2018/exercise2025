/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06E07;

/**
 *
 * @author njxnj
 */
import java.util.Random;
public class W06E07 {
    public static void main(String[] args) {
        Random r=new Random();
        int [] num=new int[20];
        for (int i=0;i<20;i++){
            num[i]=r.nextInt(100);
        }
        for (int i=0;i<20;i++){
            System.out.print(num[i]+" ");
        }
        for (int i=1;i<20;i++){
            for (int j=0;j<19;j++){
            if (num[j]>num[j+1]){
                int temp=num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
            }
        }
        }
        System.out.println("\nBubble Sort");
        System.out.println("Ascending");
        for (int i=0;i<20;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("\nDescending");
        for (int i=1;i<20;i++){
            for (int j=0;j<19;j++){
            if (num[j]<num[j+1]){
                int temp=num[j];
                num[j]=num[j+1];
                num[j+1]=temp;
            }
        }
        }
        for (int i=0;i<20;i++){
            System.out.print(num[i]+" ");
        }
    }
}
