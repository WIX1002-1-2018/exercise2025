import java.util.Scanner;
class w05e05 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("How many numbers will you enter?");
       int howMany = scanner.nextInt();
       int even = 0, odd = 0;
       for (int i = 1; i <= howMany; i++) {
           System.out.println("Enter the number: ");
           int num = scanner.nextInt();
           if (num % 2 == 0) {
               even++;
           } else {
               odd++;
           }
           
       }
       System.out.println("Total even numbers: "+ even);
       System.out.println("Total odd numbers: "+ odd);
    }
}