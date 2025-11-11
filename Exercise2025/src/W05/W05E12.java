package W05;

/*
 * @author Muhd Fathi Nuqman
 */

import java.util.Scanner;

public class W05E12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = 1, n2 = 1, tempn2, month = 1, inputmonth;

        System.out.print("Input month: ");
        inputmonth = in.nextInt();

        while (true) {
            System.out.printf("Month %d: %d pairs\n", month, n2);
            if (month >= inputmonth) break;
            if (n2 > 1000){
                System.out.print("LIMIT EXCEEDED!");
                break;
            }
            tempn2 = n2;
            n2 += n1;
            n1 = tempn2;
            month++;
        }

        in.close();
    }
}
