/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;
import java.util.Scanner;
/**
 *
 * @author Zahran
 */
public class W05E05A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbersEntered;
        int number;
        int loopCount = 1;
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("How many numbers will you enter?: ");
        numbersEntered = input.nextInt();
        
        while (loopCount <= numbersEntered){
            System.out.println("Enter a number: ");
            number = input.nextInt();
            if (number % 2 == 0){
                evenCount++;
            }
            else if (number % 2 != 0){
                oddCount++;
            }
            loopCount++;
        }
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        
    }
}
