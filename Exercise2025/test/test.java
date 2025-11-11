/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int check=s.nextInt();
	while(check<1){
            System.out.print("Please enter a positive number: ");
	    check=s.nextInt();
        };
        System.out.println("You entered: "+check);
    }
}
