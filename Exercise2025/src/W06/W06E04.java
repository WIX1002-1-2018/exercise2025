package W06;

public class W06E04 {
    public static void main(String[] args) {
        char[] symbols = {'$', '%', '+', '-'};
        symbols[2] = '*';
        for (int i = 0; i < symbols.length; i++) System.out.println(symbols[i]);
    }
}
