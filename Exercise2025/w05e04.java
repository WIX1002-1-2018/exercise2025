import java.util.Scanner;
class w05e04 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int posNum;
       while (true) {
           System.out.println("Enter a positive number:");
           posNum = scanner.nextInt();
           if (posNum <= 0) {
               System.out.println("Please enter a positive number:");
               continue;
           } else {
               System.out.println("Your number: " + posNum);
               break;
           }
       }
    }
}