package W07;

import java.util.Random;

public class W07E02 {
    public static void main(String[] args) {
        int[][] shoeIndustry = new int[5][9];
        Random rng = new Random();

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        for (int i = 0; i < shoeIndustry.length; i++){
            shoeIndustry[i][0] = i + 5;
            shoeIndustry[i][1] = rng.nextInt(11);
            for (int d = 0; d < 7; d++){
                shoeIndustry[i][d + 2] = rng.nextInt(101);
            }
        }
        
        for (int d = 0; d < 7; d++){
            String dayName = days[d];
            int highestSales = 0;
            int sizeWithHighestSales = 0;
            for (int i = 0; i < shoeIndustry.length; i++){
                if (shoeIndustry[i][d + 2] > highestSales){
                    sizeWithHighestSales = shoeIndustry[i][0];
                    highestSales = shoeIndustry[i][d + 2];
                }
            }
            System.out.printf("Shoe size %d has highest sales (%s): %d pairs\n", sizeWithHighestSales, dayName, highestSales);
        }
        
    }
}
