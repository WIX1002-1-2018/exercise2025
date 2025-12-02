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
public class W07E03 {

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
    
   static void run2(){
       int [][] salesTable = new int[5][7];
        int highestSales = -1;
        int highestDay = 0;
        int highestSize = 0;
        String stringDay = "";
        
        String [] day = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        Random random = new Random();
        
        for(int i=0;i< salesTable.length;i++){
            int sales=0;
            int size = 6+i;
           
            
            for(int iDay = 0; iDay < day.length;iDay++){
                sales = random.nextInt(101);
                salesTable[i][iDay] = sales;
              //  System.out.println(day[i] + " Size " + size + " with Sales : " + sales);
                
                if(sales > highestSales){
                    highestSales = sales ;
                    highestDay = iDay;
                    highestSize = size;
                    stringDay = day[highestDay];
                }
            }
            
            
        }
        
        System.out.println("The highest sales: Size " + highestSize + " (" + day[highestDay] + ") with " + highestSales + " pairs");
        System.out.println("The highest sales: Size " + highestSize + " (" + stringDay + ") with " + highestSales + " pairs");
    
   }
    public static void main(String[] args) {
        // TODO code application logic here
        run();
        run2();
           
    }
    
}
