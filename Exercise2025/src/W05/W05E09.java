package W05;
import java.util.Scanner;

public class W05E09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int strength = 0;

        System.out.print("Enter password: ");
        String password = in.next();

        if ( // Checks if password is a mix of lowercase and uppercase characters
            !(password.toLowerCase().equals(password))
         && !(password.toUpperCase().equals(password))
        ) strength++;

        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        String numbers = "1234567890";
        char selectedChar;
        boolean foundLetter = false, foundNumber = false;

        for (int i = 0; i < password.length() - 1; i++){
            selectedChar = password.charAt(i);

            for (int j = 0; j < numbers.length() - 1; j++){ // Checks for numerical characters
                if (numbers.charAt(j) == selectedChar){
                    foundNumber = true;
                }
            }
            if (foundNumber) strength++;

            for (int j = 0; j < alphabet.length() - 1; j++){ // Checks for special characters
                if (alphabet.charAt(j) == selectedChar){
                    foundLetter = true;
                }
            }
            if (!foundLetter) strength++;
        }

        System.out.print("Password strength: ");
        if (strength >= 4)      System.out.print("Strong");
        else if (strength >= 2) System.out.print("Medium");
        else                    System.out.print("Weak");

        in.close();
    }
}
