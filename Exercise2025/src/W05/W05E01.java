package W05;

public class W05E01 {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        //while loop
        int j = 0;
        while (j <= 20) {
            System.out.println(j);
            j = j + 2;
        }

        //do while loop
        int k = 0;
        do {
            System.out.println(k);
            k = k + 2;
        } while (k <= 20);
    }
}