package W05;
import java.util.Scanner;

public class W05E11 {
    public static boolean checkPrime(int n){
        if (n <= 1) return false;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter key: ");

        int key = in.nextInt();

        if (key <= 50) System.out.println("Invalid Key: Too Small");
        else if (!checkPrime(key)) System.out.println("Invalid Key: Not Prime");
        else System.out.println("Valid Key");
        
        in.close();
    }
}
