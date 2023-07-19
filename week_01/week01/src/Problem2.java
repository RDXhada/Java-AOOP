import java.util.Scanner;
import java.lang.Math;
public class Problem2 {
    public static boolean isFiveNumbers(int number) {
        if (((int) Math.log10(number) + 1) == 5) {
            return true;
        }
        return false;
    }

    public static void SeparateDigits(int number) {
        int originalNumber = number;
        for (int i = 0; i < number; i++) {
            System.out.printf(number%10 + " ");
            number /= 10;
        }
        System.out.printf(number + " ");
        int firstDigit = originalNumber % 10;
        int secondDigit = (originalNumber / 10) % 10;
        int fourthDigit = (originalNumber / 100) % 10;
        int lastDigit = number;
        if (firstDigit == lastDigit) {
            System.out.println("\nFirst and last numbers are identical!");
        }
        if(secondDigit == fourthDigit)
        {
            System.out.println("Second and fourth digits are identical!");
        }
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int number2 = input.nextInt();
        System.out.printf("Tells whether the number is 5 digit: " + isFiveNumbers(number1));
        System.out.println("\nOutput2: ");
        SeparateDigits(number2);
    }

}
