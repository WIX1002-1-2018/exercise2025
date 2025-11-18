/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W06E08;
import java.util.Random;
public class W06E08 {
    public static void main(String[] args) {
        Random r = new Random();
        int [] number = new int [20];
        for (int i=0; i<20; i++){
            number[i] = r.nextInt(100);
        }
        for(int value:number){
            System.out.print(value+" ");
        }
        for (int i=1; i<20; i++){
            for (int j=0; j<19; j++){
                if (number[j]>number[j+1]){
                    int temp = number[j];
                    number[j] = number[j+1];
                    number[j+1] = temp;
                }
            }
        }

        System.out.println("\nBubble Sort :");
        System.out.println("Ascending :");
        int sum=0;
        for(int ascending:number){
            System.out.print(ascending+" ");
            sum+=ascending;
        }

        System.out.println("\nMinimum : "+number[0]);
        System.out.println("Maximum : "+number[19]);
        System.out.println("Sum : "+sum);
    }
}
