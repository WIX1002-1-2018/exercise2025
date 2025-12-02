package W07;

import java.util.Random;

public class W07E02B {

    public static void main(String[] args) {
        int[][] salesTable = new int[5][7];//size,day,
        Random r = new Random();
        String[] day = {"Monday", "Tuesday", "Wednestay", "Thursday", "Friday", "Saturday", "Sunday"};
        //generate the stocks
        int highestDay = 0;
        int highestSales = -1;
        int highestSize = 0;
        String stringDay="";
        for (int i = 0; i < salesTable.length; i++) {
            int size = 6 + i;
            for (int iDay = 0; iDay < day.length; iDay++) {
                int sales = r.nextInt(101);
                salesTable[i][iDay] = sales;
                System.out.println(day[i] + " size " + "with sales " + sales);

                if (sales > highestSales) {
                    highestSales = sales;
                    highestDay = iDay;
                    highestSize = size;
                    stringDay=day[highestDay];
                }
            }
           
        }//or change this to simpler version : store index/store value
         System.out.println("The highest sales: Size " +highestSize+"("+day[highestDay]+")+ with"+highestSales+" pairs");
         System.out.println("The highest sales: Size " +highestSize+"("+stringDay+")+ with"+highestSales+" pairs");
        //alraeady know the rowm referring to size so no need to store the size
        //the already shoestock:
    }
}
//WHAT IS HTE HIGHEST VALUE OF THE SPECIFIC CELL, //DISPLAY THE HIHEST VALUE, HOW MANY OF THEM, ON WHICH DAY WHICH SIZE
//size 8 (Tuesday) with 30 pairs
//no need 3d
