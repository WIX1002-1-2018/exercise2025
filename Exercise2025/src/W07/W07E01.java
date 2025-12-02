package W07;

import java.util.Random;

public class W07E01 {
    public static void main(String[] args) {
        int[][] shoeIndustry = new int[5][9];
        Random rng = new Random();

        for (int i = 0; i < shoeIndustry.length; i++){
            shoeIndustry[i][0] = i + 5;
            shoeIndustry[i][1] = rng.nextInt(11);
        }
        
        for (int i = 0; i < shoeIndustry.length; i++){
            int size = shoeIndustry[i][0];
            int stock = shoeIndustry[i][1];

            if (stock > 5) System.out.println("Size " + size + " Available");
            else if (stock > 0) System.out.println("Size " + size + " Few stocks");
            else System.out.println("Size " + size + " Unavailable");
        }

    }
}
