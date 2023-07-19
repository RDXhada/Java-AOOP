import java.util.Scanner;
public class Addition {

    public static double calculateToCelsius(double fhr)
    {
        double C = 5.0 / 9.0 * ( fhr - 32 );
        return C;
    }

    public static double calculateToFahrenheit(double cls)
    {
        double F = 9.0 / 5.0 * cls + 32;
        return F;
    }


    final int somethingLmao = 1024;
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            System.out.print("Input something\n");
            int number1;
            int number2;
            int number3;
            number1 = input.nextInt();
            number2 = input.nextInt();
            number3 = number1 + number2;
            int number4 = 60_000_000;
            System.out.printf("Output is : " + number3 + '\n');
            if(number1 == number2) {
                System.out.printf("Output of number4 : " + number4 + '\n');
            }
            else
            {
                System.out.printf("Numbers must be equal");
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("\n" + calculateToCelsius(70));
        System.out.print("\n" + calculateToFahrenheit(21));


    }

}