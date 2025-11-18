package W06;

import java.util.Random;

public class W06E05 {
    public static void main(String[] args) {
        char[] randomList = new char[100];
        Random rng = new Random();
        int females = 0;
        for (int i = 0; i < randomList.length; i++){
            randomList[i] = (rng.nextInt(2) == 1) ? 'M' : 'F';
            if (randomList[i] == 'F') females++ ;
        }
        System.out.println(females);
    }
}
