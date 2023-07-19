import java.util.Scanner;

public class HammingDistance {
    //calculate hamming distance
    public static int hammingDistance(int n1, int n2)
    {
        int xor = n1 ^ n2;
        int distance = 0;

        while (xor > 0)
        {
            distance += xor & 1;
            xor >>= 1;
        }
        return distance;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input
        System.out.print("Въведете първото число: ");
        int number1 = input.nextInt();
        System.out.print("Въведете второто число: ");
        int number2 = input.nextInt();

        //output binary nums
        System.out.printf("Първото число в двоичен вид: %08d%n", Integer.parseInt(Integer.toBinaryString(number1)));
        System.out.printf("Второто число в двоичен вид: %08d%n", Integer.parseInt(Integer.toBinaryString(number2)));

        //output haming distance
        System.out.printf("Разстояние по Хаминг между двете числа: %d%n", hammingDistance(number1, number2));
    }
}
