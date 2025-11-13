/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pingshuya
 */
import java.util.Scanner;

public class lab3q3 {
    public static void main(String[] arge){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the sales volume: ");
        double sales = input.nextDouble();
        
        double commissionRate;
        double commission;
        
        if (sales <= 100) {
            commissionRate = 0.05;
        } else if (sales <= 500){
            commissionRate = 0.075;
        } else if (sales <= 1000) {
            commissionRate = 0.01;
        } else {
            commissionRate = 0.125;
        }
        
        commission = sales * commissionRate;
        
        System.out.printf("Total commission: RM %.2f%n", commission);
        
    }
    
    
}
