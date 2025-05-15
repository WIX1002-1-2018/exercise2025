/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W07;

import java.util.Random;

/**
 *
 * @author pensyarah
 */
public class W07T01 {
    
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));      
    }
    
    public static void isSquare(int a){
        if (a % Math.sqrt(a)== 0){
            System.out.println(a + " is a perfect square.");
        }else{
            System.out.println(a + " is not a perfect square.");
        }
    }
    
    public  static double c(int n, int k) {
       int result1 = 1, result2 = 1, result3 =1;
       for (int i = 2; i <= n; i++){
           result1 *= i;
       }
       for (int i = 2; i <= k; i++){
           result2 *= i;
       }
       for (int i = 2; i <= (n - k); i++){
           result3 *= i;
       }
       return result1 / (double) (result2 * (result3));
    }
   
    public static boolean isPentagonal(int x){
        int n=1;
        while ( true ){
            int pentagonalNumber = n* ( 3*n-1)/2;
            if ( pentagonalNumber == x)
                return true;
       
        if ( pentagonalNumber > x){
            return false;
        }
        n++;
    }
    }
    
    public static void main(String[] args) {
        isSquare(25);
        System.out.println(c(15,2));
        System.out.println(maxOfThree(5,130,8));
        System.out.println(maxOfThree(5,13,80));
        System.out.println(isPentagonal(10));
        LetterDigit("79454skjdfghk34872937");
    

        double[] results = calculateCircle(22);
        System.out.println("circle with radius" + ":");
        System.out.println("Area : " + results[0]);
        System.out.println("circumference : " + results[1]);
        
        int duplicate= findFirst();
        System.out.println("First random num generated twice: "+duplicate);
        
        int[] randomNumList = new int [10];
        generateRandomNo (randomNumList);
        
        for (int num : randomNumList) {
            System.out.print(num + " ");
        }
    }
    
   public static int findFirst(){
       Random r= new Random();
       int[]count=new int[11];
       int[]num=new int[100];
       int randomnum=0;
       while(true){
           randomnum=r.nextInt(11);
           count[randomnum]++;
           if(count[randomnum]==2)
               break;
           }
         return randomnum;        
   } 
    
    public static double[] calculateCircle(double radius){
        final double PI = Math.PI; 
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        return new double[]{area, circumference};
     }
    
    public static void LetterDigit(String input) {
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i<input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)){
                digitCount++;
            }
        }
        System.out.println("Number of digits is " + digitCount);
        System.out.println("Number of letters is " + letterCount);
    }
    
    public static void generateRandomNo(int[] randomNum){
        Random random = new Random();
        for (int ct = 0; ct < randomNum.length; ct++){
            randomNum [ct] = random.nextInt (101);
        }
    }
    
}
