package W07;

import java.util.Random;

/**
 * W07T01 - Assorted Utility Methods Demonstration
 * Demonstrates: Multiple independent static methods performing math,
 * number theory, string, and random operations.
 *
 * Methods:
 * - maxOfThree(int,int,int): largest of three numbers (using Math.max).
 * - isSquare(int): prints whether number is a perfect square.
 * - c(int n, int k): combination nCk via factorial products.
 * - isPentagonal(int x): checks if x is a pentagonal number.
 * - findFirst(): returns first random number (0..10) appearing twice.
 * - calculateCircle(double r): returns area & circumference.
 * - LetterDigit(String s): counts letters vs digits.
 * - generateRandomNo(int[]): fills array with random 0..100 values.
 *
 * Key Concepts:
 * - Basic math (factorial, combinatorics, perfect square test).
 * - Loop with early termination.
 * - Character classification via Character methods.
 * - Returning arrays for multiple results.
 *
 * @author pensyarah
 */
public class W07T01 {
    
    public static int maxOfThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
    
    public static void isSquare(int a) {
        // Perfect square check: sqrt(a) should be integer.
        double root = Math.sqrt(a);
        if (root == (int) root) {
            System.out.println(a + " is a perfect square.");
        } else {
            System.out.println(a + " is not a perfect square.");
        }
    }
    
    public static double c(int n, int k) {
        // Compute nCk using factorial-like accumulation.
        int factN = 1, factK = 1, factNMinusK = 1;
        for (int i = 2; i <= n; i++) factN *= i;
        for (int i = 2; i <= k; i++) factK *= i;
        for (int i = 2; i <= (n - k); i++) factNMinusK *= i;
        return factN / (double) (factK * factNMinusK);
    }
   
    public static boolean isPentagonal(int x) {
        int n = 1;
        while (true) {
            int pentagonalNumber = n * (3 * n - 1) / 2;
            if (pentagonalNumber == x) return true;
            if (pentagonalNumber > x) return false; // overshoot => not pentagonal
            n++;
        }
    }
    
    public static void main(String[] args) {
        isSquare(25); // sample perfect square test
        System.out.println(c(15,2));
        System.out.println(maxOfThree(5,130,8));
        System.out.println(maxOfThree(5,13,80));
        System.out.println(isPentagonal(10));
        LetterDigit("79454skjdfghk34872937");
    

        double[] results = calculateCircle(22);
        System.out.println("circle with radius" + ":");
        System.out.println("Area : " + results[0]);
        System.out.println("circumference : " + results[1]);
        
        int duplicate = findFirst();
        System.out.println("First random num generated twice: " + duplicate);
        
        int[] randomNumList = new int [10];
        generateRandomNo (randomNumList);
        
        for (int num : randomNumList) {
            System.out.print(num + " ");
        }
    }
    
    public static int findFirst() {
        Random r = new Random();
        int[] count = new int[11]; // track occurrences of 0..10
        int randomNum;
        while (true) {
            randomNum = r.nextInt(11);
            count[randomNum]++;
            if (count[randomNum] == 2) break; // first to reach 2
        }
        return randomNum;
    }
    
    public static double[] calculateCircle(double radius) {
        final double PI = Math.PI;
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        return new double[]{area, circumference};
    }
    
    public static void LetterDigit(String input) {
        int letterCount = 0;
        int digitCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isLetter(ch))      letterCount++;
            else if (Character.isDigit(ch))  digitCount++;
        }
        System.out.println("Number of digits is " + digitCount);
        System.out.println("Number of letters is " + letterCount);
    }
    
    public static void generateRandomNo(int[] randomNum) {
        Random random = new Random();
        for (int ct = 0; ct < randomNum.length; ct++) {
            randomNum[ct] = random.nextInt(101); // 0..100
        }
    }
    
}
