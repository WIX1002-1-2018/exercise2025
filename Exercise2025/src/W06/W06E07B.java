package W06;

import java.util.Random;

public class W06E07B {
    public static void main(String[] args) {
        Random rng = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++){
            a[i] = rng.nextInt(100);
        }
        for (int pass = 1; pass < a.length; pass++){
            for (int i = 0; i < a.length - 1; i++){
                if (a[i] < a[i+1]){
                    int hold = a[i];
                    a[i] = a[i+1];
                    a[i+1] = hold;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
    }
}
