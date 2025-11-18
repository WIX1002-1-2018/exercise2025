package W0r;

public class W06E03 {
    public static void main(String[] args) {
        int[] array = new int[100];
        array[0] = 12;
        array[99] = 89;

        char[] symbols = {'$', '%', '+', '-'};
        symbols[2] = '*';
        
        for (int i = 0; i < symbols.length; i++) System.out.println(symbols[i]);
    }
}