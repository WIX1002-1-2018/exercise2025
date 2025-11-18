/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.Random;
public class test {
    public static void main(String[] args) {
Random r=new Random();
int[] s=new int[100];
char[] st=new char[100];
int count=0;
for(int i=0;i<100;i++){
    s[i]=r.nextInt(2);
    if(s[i]==0){
        st[i]='F';
        count++;
    }else{
        st[i]='M';
    }
System.out.println(count+" student(s)");
}
    }
}
