import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        // Uppercase letters
        char letterA = 'A';
        char letterB = 'B';
        char letterC = 'C';

        // Lowercase letters
        char lettera = 'a';
        char letterb = 'b';
        char letterc = 'c';

        // Digits
        char digit0 = '0';
        char digit1 = '1';
        char digit2 = '2';

        // Special symbols
        char dollarSign = '$';
        char asterisk = '*';
        char plusSign = '+';
        char forwardSlash = '/';
        char blankSpace = ' ';

        // Display the integer equivalents of each character
        System.out.println("Integer equivalents:");
        System.out.println(letterA + ": " + (int)letterA);
        System.out.println(letterB + ": " + (int)letterB);
        System.out.println(letterC + ": " + (int)letterC);
        System.out.println(lettera + ": " + (int)lettera);
        System.out.println(letterb + ": " + (int)letterb);
        System.out.println(letterc + ": " + (int)letterc);
        System.out.println(digit0 + ": " + (int)digit0);
        System.out.println(digit1 + ": " + (int)digit1);
        System.out.println(digit2 + ": " + (int)digit2);
        System.out.println(dollarSign + ": " + (int)dollarSign);
        System.out.println(asterisk + ": " + (int)asterisk);
        System.out.println(plusSign + ": " + (int)plusSign);
        System.out.println(forwardSlash + ": " + (int)forwardSlash);
        System.out.println(blankSpace + ": " + (int)blankSpace + " (blank space)");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter random tag: ");
        String enterRandomTag = input.nextLine();
        System.out.println("Value of random tag : " + (int)enterRandomTag.charAt(0));

    }
}
