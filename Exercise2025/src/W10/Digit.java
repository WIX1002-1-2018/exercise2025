/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W10;

/**
 *
 * @author pensyarah
 */
public class Digit {
    int x;
    
    public Digit(int number){
        x = number;
    }
    
    public int digitMultiplication(){
        int num = x;
        int result = 1;
        
        while (num >0){
            int digit = num %10;
            result *= digit;
            num /= 10;
        }
        return result;
    }
    
    //display multiplication
    public void display(){
        int result = digitMultiplication();
        System.out.println("Multiplication of " + x + ": " + result);
    }
}
