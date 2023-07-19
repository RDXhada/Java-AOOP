import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a four-digit integer
        System.out.print("Enter a four-digit integer: ");
        int num = input.nextInt();

        // Encrypt the integer
        int encrypted = Encrypt(num);
        System.out.println("Encrypted integer: " + encrypted);

        // Decrypt the integer
        int decrypted = Decrypt(encrypted);
        System.out.println("Decrypted integer: " + decrypted);
    }

    // Function to encrypt a four-digit integer
    public static int Encrypt(int num) {
        // Convert the integer to a string
        String numStr = Integer.toString(num);

        // Replace each digit by (the sum of that digit plus 7) modulo 10
        int[] encryptedDigits = new int[4];
        for (int i = 0; i < 4; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            encryptedDigits[i] = (digit + 7) % 10;
        }

        // Swap the first digit with the third, and swap the second digit with the fourth
        int temp = encryptedDigits[0];
        encryptedDigits[0] = encryptedDigits[2];
        encryptedDigits[2] = temp;

        temp = encryptedDigits[1];
        encryptedDigits[1] = encryptedDigits[3];
        encryptedDigits[3] = temp;

        // Convert the encrypted digits back to an integer
        int encryptedNum = 0;
        for (int i = 0; i < 4; i++) {
            encryptedNum += encryptedDigits[i] * Math.pow(10, 3-i);
        }

        return encryptedNum;
    }

    // Function to decrypt an encrypted four-digit integer
    public static int Decrypt(int encrypted) {
        // Convert the encrypted integer to a string
        String encryptedStr = Integer.toString(encrypted);

        // Swap the first digit with the third, and swap the second digit with the fourth
        int[] decryptedDigits = new int[4];
        decryptedDigits[0] = Character.getNumericValue(encryptedStr.charAt(2));
        decryptedDigits[1] = Character.getNumericValue(encryptedStr.charAt(3));
        decryptedDigits[2] = Character.getNumericValue(encryptedStr.charAt(0));
        decryptedDigits[3] = Character.getNumericValue(encryptedStr.charAt(1));

        // Replace each digit by (the sum of that digit minus 7) modulo 10
        for (int i = 0; i < 4; i++) {
            decryptedDigits[i] = (decryptedDigits[i] + 3) % 10;
        }

        // Convert the decrypted digits back to an integer
        int decryptedNum = 0;
        for (int i = 0; i < 4; i++) {
            decryptedNum += decryptedDigits[i] * Math.pow(10, 3-i);
        }

        return decryptedNum;
    }
}
