/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaz
 */
import java.util.Scanner;
public class W05E07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        boolean a;
        double c , e ;
        double expenses = 0;
        
        System.out.println("=== EXPENSES TRACKER ===");
        
        
        do{
            //System.out.println();
            System.out.print("Enter...: ");
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
        }while (a = true);{
        System.out.println("Total Expenses: " + expenses);
        
        }
        
        
        
        
    
    }    
}
