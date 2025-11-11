import java.util.Scanner;
class w05e03 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String yesOrNo = "";
       while (true) {
           System.out.println("Do you want to continue?(yes/no):");
           yesOrNo = scanner.nextLine();
           if (yesOrNo.equals("Yes")) {
               continue;
           } else if (yesOrNo.equals("No")) {
               break;
           } else {
               System.out.println("Please enter Yes/No only!");
           }
       }
    }
}