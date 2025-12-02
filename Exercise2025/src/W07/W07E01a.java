package W07;

import java.util.Random;

public class W07E01a {

    public static void main(String[] args) {
        int[][] shoeStock = new int[5][2];
        Random r = new Random();
        int size = 6;
        for (int i = 0; i < 5; i++) {

            shoeStock[i][0] = size;
            size++;
            shoeStock[i][1] = r.nextInt(11);
        }
        System.out.println("The stock array is:");
        for (int i = 0; i < 5; i++) {

            System.out.println("size:" + shoeStock[i][0]);
            System.out.println("stock: " + shoeStock[i][1]);

        }
        for (int i = 0; i < 5; i++) {
            if (shoeStock[i][0] == 6) {
                if (shoeStock[i][1] == 0) {
                    System.out.println("Out of Stock");
                } else if (shoeStock[i][1] < 3) {
                    System.out.println("Low Stock");
                } else {
                    System.out.println("Available");
                }
            } else if (shoeStock[i][0] == 7) {
                if (shoeStock[i][1] == 0) {
                    System.out.println("Out of Stock");
                } else if (shoeStock[i][1] < 3) {
                    System.out.println("Low Stock");
                } else {
                    System.out.println("Available");
                }
            } else if (shoeStock[i][0] == 8) {
                if (shoeStock[i][1] == 0) {
                    System.out.println("Out of Stock");
                } else if (shoeStock[i][1] < 3) {
                    System.out.println("Low Stock");
                } else {
                    System.out.println("Available");
                }
            } else if (shoeStock[i][0] == 9) {
                if (shoeStock[i][1] == 0) {
                    System.out.println("Out of Stock");
                } else if (shoeStock[i][1] < 3) {
                    System.out.println("Low Stock");
                } else {
                    System.out.println("Available");
                }
            } else {
                if (shoeStock[i][1] == 0) {
                    System.out.println("Out of Stock");
                } else if (shoeStock[i][1] < 3) {
                    System.out.println("Low Stock");
                } else {
                    System.out.println("Available");
                }
            }
        }
    }
}
