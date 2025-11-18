package W06;

import java.util.Random;
import java.util.Scanner;

public class W06E08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rng = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++){
            a[i] = rng.nextInt(100);
            System.out.print(a[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Enter number to search : ");
        int toFind = in.nextInt();
        for (int i = 0; i < a.length; i++){
            if (toFind == a[i]){
                System.out.print("Found in position " + i);
                return;
            }
        }
        System.out.print("Not found!");
    }
}
