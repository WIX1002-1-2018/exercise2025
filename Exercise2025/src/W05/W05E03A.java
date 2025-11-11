package W05;

import java.util.Scanner;
//import java.util.InputMismatchException;

//author: Luo YanHao

public class W05E03A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;
        while (isTrue) {
            System.out.print("Do you want to continue? (yes/no): ");
            String res = scanner.next();
            if (res.equalsIgnoreCase("no"))
                isTrue = false;
        }
        System.out.println("Program ended.");
        scanner.close();
    }

}
