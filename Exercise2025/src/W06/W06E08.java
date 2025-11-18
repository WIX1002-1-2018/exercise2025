package W06;
import java.util.Scanner;
import java.util.Random;

public class W06E08 {
    public static void main(String[] args) {
        Random g = new Random();
        int [] number = new int[20];
        int min = 999, max = -999, sum = 0;
        for(int i = 0; i < number.length; i++){
            number[i] = g.nextInt(100);
            sum += number[i];
        }
            
        
        for(int element : number){
            System.out.print(element + " ");
        }
        
        //Bubble sort method
        for(int i = 0; i < number.length - 1; i++){
            for(int j = 0; j < number.length - 1; j++)
            if(number[j] > number [j+1]){
                int temp = number[j];
                number[j] = number[j+1];
                number[j+1] = temp;
            }
        }
        System.out.println();
        System.out.println("Bubble Sort");
        for(int elementBS : number){
            System.out.print(elementBS + " ");
        }
        System.out.println();
        System.out.println("Min: " + number[0]);
        System.out.println("Max: "+ number[number.length -1]);
        System.out.println("Sum of number: " + sum);
    
    }
}
