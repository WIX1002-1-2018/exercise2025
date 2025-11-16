/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 * W05E09 - Password Strength Checker
 * Demonstrates: String character analysis using loops and Character class methods
 * 
 * Key Concepts:
 * - String traversal using charAt() in a loop
 * - Character classification (uppercase, lowercase, digit, symbol)
 * - Boolean flag pattern (tracking if a category appears at least once)
 * - Password strength criteria evaluation
 * 
 * Strength Criteria:
 * - Strong: Contains all 4 types (uppercase, lowercase, digit, symbol)
 * - Medium: Contains 2-3 types
 * - Weak: Contains 0-1 types
 * 
 * Algorithm:
 * 1. Initialize counters for each character type (0 or 1 only)
 * 2. Loop through each character in password
 * 3. Check character type and increment corresponding counter (max 1 per type)
 * 4. Sum all counters to determine diversity
 * 5. Classify strength based on total
 * 
 * @author Dzaky Arya
 */
import java.util.Scanner;
public class W05E09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Flags to track presence of each character type (0=absent, 1=present)
        int upper=0, lower=0, digit=0, symbol=0;
        
        System.out.print("Enter password: ");
        String pass = input.nextLine();
        
        // Check each character in the password
        for (int i=0; i<pass.length();i++){
            char per = pass.charAt(i);
            
            // Check for uppercase letter
            if (Character.isUpperCase(per)){
                if(upper==0){
                   upper+=1; // Mark uppercase as present
                }
            }
            // Check for lowercase letter
            else if (Character.isLowerCase(per)){
                if(lower==0){
                   lower+=1; // Mark lowercase as present
                }
            }
            // Check for digit
            else if (Character.isDigit(per)){
                if (digit==0){
                    digit+=1; // Mark digit as present
                }
            }
            // Everything else is considered a symbol
            else{
                if(symbol==0){
                    symbol+=1; // Mark symbol as present
                }
            }
        }
        
        // Calculate total diversity (0-4)
        int diversity = upper + lower + symbol + digit;
        
        // Classify password strength based on diversity
        if(diversity==4){
            System.out.println("Password Strength: Strong");
        }
        else if(diversity>=2){
            System.out.println("Password Strength: Medium");
        }
        else{
            System.out.println("Password Strength: Weak");
        }
        
        input.close(); // Close scanner to prevent resource leak
    }    
}
