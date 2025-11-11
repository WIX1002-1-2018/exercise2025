package W05;

import java.util.Scanner;

public class W05E10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of days (N): ");
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(j + " ");
            }
            System.out.println(); 
        }
        
    }
    
}
