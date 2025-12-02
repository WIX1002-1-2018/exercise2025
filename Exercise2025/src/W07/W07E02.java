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
public class W07E02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
    
}
