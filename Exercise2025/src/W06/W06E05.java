package W06;

import java.util.Random;

public class W06E05 {

    public static void main(String[] args) {
        int[] random = new int[100];
        char[] student = new char[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            random[i] = r.nextInt(10) + 1;
        }

        int F = 0;
        for (int i = 0; i < 100; i++) {
            if (random[i] % 2 == 0) {
                student[i] = 'M';
            } else {
                student[i] = 'F';
                F++;
            }
        }
        System.out.println("Female student: " + F);
    }
}
