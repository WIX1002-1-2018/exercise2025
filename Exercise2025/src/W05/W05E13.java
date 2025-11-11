package W05;

/*
 * @author Muhd Fathi Nuqman
 */

import java.util.Scanner;

public class W05E13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tree height: ");
        int height = in.nextInt();
        int baselength = 1 + 2 * (height - 1); // Find base pyramid length using arithmetic series
        int space, length;
        for (int i = 1; i <= height; i++){
            space = baselength / 2 + 1 - i;
            length = 1 + 2 * (i - 1);
            for (int j = 0; j < space; j++) System.out.print(" ");
            for (int j = 0; j < length; j++) System.out.print("*");
            System.out.print("\n");
        }

        length = height/3 + 1;
        if (length % 2 == 0) length++;
        int a = (length - 1)/2 + 1;
        space = baselength / 2 + 1 - a;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < space; j++) System.out.print(" ");
            for (int j = 0; j < length; j++) System.out.print("*");
            System.out.print("\n");
        }
        in.close();
    }
}
