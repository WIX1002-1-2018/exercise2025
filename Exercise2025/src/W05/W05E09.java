/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author Dzaky Arya
 */
import java.util.Scanner;
public class W05E09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int upper=0, lower=0, digit=0, symbol=0;
        
        System.out.print("Enter password: ");
        String pass = input.nextLine();
        
        for (int i=0; i<pass.length();i++){
            char per = pass.charAt(i);
            
            if (Character.isUpperCase(per)){
                if(upper==0){
                   upper+=1;
                }
            }
            else if (Character.isLowerCase(per)){
                if(lower==0){
                   lower+=1;
                }
            }
            else if (Character.isDigit(per)){
                if (digit==0){
                    digit+=1;
                }
            }
            else{
                if(symbol==0){
                    symbol+=1;
                }
            }
        }
        if(upper+lower+symbol+digit==4){
            System.out.println("Password Strength: Strong");
        }
        else if(upper+lower+symbol+digit>=2){
            System.out.println("Password Strength: Medium");
        }
        else if(upper+lower+symbol+digit>=0){
            System.out.println("Password Strength: Weak");
        }                
    }    
}
