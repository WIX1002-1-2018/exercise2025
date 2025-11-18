/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
Random r=new Random();
int[] a=new int[20];
for(int i=0;i<20;i++){
    a[i]=r.nextInt(100);
    System.out.print(a[i]+" ");
}
System.out.println();
System.out.println("Bubble sort");
for(int i=1;i<20;i++){
    for(int j=0;j<19;j++){
        if(a[j]>a[j+1]){
            int b=a[j];
            a[j]=a[j+1];
            a[j+1]=b;
        }
    }
}
for(int i=0;i<20;i++){
    System.out.print(a[i]+" ");
}
System.out.println();
    }
}
