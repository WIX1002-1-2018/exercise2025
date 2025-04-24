import java.util.Random;

public class W06T06B {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(256); // Generate random integer between 0 and 255
        int[] binaryArray = new int[8];

        System.out.print("Binary representation: " + randomNumber + " = ");
        for (int i = 7; i >= 0; i--) {
            binaryArray[i] = randomNumber % 2;
            randomNumber /= 2;
        }

        
        for (int bit : binaryArray) {
            System.out.print(bit);
        }
    }
}
