import java.util.Scanner;
import java.lang.Math;
public class Zad2 {
    public static boolean isFiveNumbers(int number) {
        if (((int) Math.log10(number) + 1) == 5) {
            return true;
        }
        return false;
    }

    public static void SeparateDigits(int number) {
        int originalNumber = number;
        for (int i = 0; i < number; i++) {
            System.out.printf(" " + number % 10);
            number /= 10;
        }
        System.out.printf(" " + number);
        int firstDigit = originalNumber % 10;
        int secondDigit = (originalNumber / 10) % 10;
        int fourthDigit = (originalNumber / 100) % 10;
        int lastDigit = number;
        if (firstDigit == lastDigit) {
            System.out.printf(" First and last numbers are identical!\n");
        }
        if(secondDigit == fourthDigit)
        {
            System.out.printf("Second and fourth digits are identical!\n");
        }
    }

//    public static void resultString(String str)
//    {
//        String reverseStr = "";
//        for (int i = 0; i < str.length(); i--)
//        {
//            reverseStr += str.charAt(i);
//        }
//        System.out.println(reverseStr);
//    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.printf("Output1: " + isFiveNumbers(number1));
        System.out.printf("\nOutput2: ");
        SeparateDigits(number2);
//        resultString("opaaaa");
    }

}
