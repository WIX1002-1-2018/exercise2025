public class W05E03 {
    public static void main(String[] args) {
String[] sentence = {"the quick brown fox", "jumps over the lazy dog", "the end"};
int count = 0;

for (String s : sentence) {
    String[] words = s.split(" ");
    for (String word : words) {
    if (word.equals("the")) {
        count++;
    }
    }
}

System.out.println("The word 'the' occurs " + count + " times.");
    }
}