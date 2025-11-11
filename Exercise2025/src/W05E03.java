import java.util.Scanner;

public class W05E03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "yes";
        while (true) {
            if (input.equals("no")) {
                break;
            }
            System.out.print("Do you want to continue? (yes/no): ");
            input = sc.nextLine();
        }
        System.out.println("Program ended.");
    }
}