/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author safaz
 */
import java.util.Scanner;
public class W05E13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        
        System.out.println("Input tree height : ");
        int height = sc.nextInt();
       
        for(int i = 1; i <= height ; i++){
            
            // spacing 
            for(int space = 1; space <= height - i ; space++){
                
                System.out.print(" ");
            }for(int b = 1; b <= height; b++){
            //  bintang
            }for(int stars = 1; stars <= i * 2 -1; stars++ ) {
                System.out.print("*");
            }
                    System.out.println();
            
        }  
        int wy = (height / 3);
        int wx = (height * 2 - 1 -wy)/2;
        for(int y = 0; y < 3; y++){
           
            //spacing
            for(int yi = 1; yi <= wx; yi++){
                System.out.print(" ");
            
            }
                System.out.print("*".repeat(wy));
                System.out.println();
 
        
       
          }
            
            
            
            
            
            
            
        
        }
        
        
        
            
        
        
        }
                   
            
            
            
            
            
     
        
        
    
    


    

