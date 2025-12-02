/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

import java.util.Random;


/**
 *
 * @author pensyarah
 */
public class W07E01 {

    /**
     * @param args the command line arguments
     */
    
    static void run(){
         int [][] shoeInventory = new int[5][2];
         
         Random random = new Random();
         
         for(int i =0;i<shoeInventory.length;i++){
             shoeInventory[i][0] = 6+i;
             shoeInventory[i][1] = random.nextInt(11);
             
         }
         
         for(int i =0;i<shoeInventory.length;i++){
             int size = shoeInventory[i][0];
             int stock = shoeInventory[i][1];
             String status = null;
             
             if(stock == 0)
                 status = "Out of Stock";
             else if(stock < 3)
                 status = "Low Stock";
             else
                 status = "Available";
            
            System.out.println("Size " + size + ": " + status + " with " + stock  + " pairs");
         }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        run();
        run();
        run();
        run();
           
    }
    
}
