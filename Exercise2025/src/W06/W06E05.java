package W06;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Random;

/**
 *
 * @author hafz's.
 */
public class W06E05 {

    public static void main(String[] args) {
        Random random = new Random();
        
        char[] students = new char[100];
        for (int i = 0; i < students.length; i++) {
            students[i] = random.nextBoolean() ? 'M' : 'F';
        }

        char[] gender = { 'M', 'F' };
        int femaleCount = 0;
        for (char student : students) 
            if (student == 'F') {
                femaleCount++;
            }
        
        System.out.println("female students count: " + femaleCount);
        }
    
    }
