import java.util.Scanner;
class w05e02 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int sum = 0;
       int inpNum = 0;
       do {
           System.out.println("Enter a number: ");
           inpNum = scanner.nextInt();
           sum += inpNum;
       } while (inpNum != 0);
       System.out.println("Sum of all numbers entered: " + sum);
    }
}