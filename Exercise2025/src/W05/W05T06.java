/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W05;

/**
 *
 * @author pensyarah
 */
import java.util.Scanner;
public class W05T06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        
        if((year % 4== 0 && year % 100 !=0 )||year%400 ==0){
            System.out.println(year + "is a leap year");
        }else{
            System.out.println(year + "is not a leap year");
        }
    }
    
}
