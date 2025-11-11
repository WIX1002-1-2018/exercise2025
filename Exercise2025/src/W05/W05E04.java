package W05;

import java.util.Scanner;

public class W05E04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int counter = 0;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
            counter += 1;
        } while (num <= 0);
        System.out.println("You entered: " + num);
        System.out.println("counter: " + counter);
    sc.close();
}
}