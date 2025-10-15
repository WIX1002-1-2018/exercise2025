public class W06T05_1 {
    public static void main(String[] args) {
        String[] sentence = {"Hello", "world", "Java", "programming"};
        
        for(int i=sentence.length-1; i>=0; i--){
            for(int j=sentence[i].length()-1; j>=0; j--)
                System.out.print(sentence[i].charAt(j));
            System.out.println();
        }

    System.out.println("\nUsing StringBuilder:");
    for (int i = sentence.length - 1; i >= 0; i--) {
        StringBuilder sb = new StringBuilder(sentence[i]);
        System.out.println(sb.reverse());
    }

    }
}
