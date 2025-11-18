package W05;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 * W05E07 - Expenses Tracker with Input Parsing and Validation
 * Demonstrates: Looping input, parsing strings to numbers, exception handling
 *
 * Key Concepts:
 * - Using a do-while loop to repeatedly read user input
 * - Parsing numeric strings with Double.parseDouble()
 * - Handling invalid input using try-catch (NumberFormatException)
 * - Using a sentinel value ("done") to stop the loop
 * - Accumulating totals across iterations
 *
 * Algorithm:
 * 1) Display a header for the expenses tracker
 * 2) Repeatedly prompt the user to enter an amount or the word "done"
 * 3) If input equals "done" (case-insensitive), break the loop
 * 4) Otherwise, attempt to parse the input as a double
 *    - If parse succeeds, add to running total
 *    - If parse fails, show "Invalid Input" and continue
 * 5) After exiting the loop, display the total expenses
 *
 * Note:
 * - The condition `while (a = true)` assigns true and therefore creates an
 *   infinite loop; termination is controlled via `break` when user types "done".
 *   This matches the current behavior; improvements could replace this with
 *   `while (true)` or a proper boolean flag check.
 *
 * @author safaz
 */
public class W05E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner for reading user input
    String input;                        // To hold each line of input
    @SuppressWarnings("unused")
    boolean a;                           // Flag variable (assigned in condition below)
    double c ;                           // c: parsed value
    @SuppressWarnings("unused")
    double e ;                           // e: unused (kept to preserve original)
        double expenses = 0;                 // Running total of all valid amounts
        
        System.out.println("=== EXPENSES TRACKER ===");
        
        
        // Loop to read values until user enters the sentinel word "done"
        do{
            //System.out.println();
            System.out.print("Enter amount (or type 'done'): ");
             input = sc.nextLine();
             
             if(input.equalsIgnoreCase("done")){
                 break;
                 
             }else{
            
          try{
              c = Double.parseDouble(input);
              a = true;
              expenses = expenses + c;
              
           
          }catch(NumberFormatException error){
              System.out.println("Invalid Input");
          }
         
             }
    }while (true);{ // loop runs until 'break' on "done"
        System.out.println("Total Expenses: " + expenses);
        
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }    
}
