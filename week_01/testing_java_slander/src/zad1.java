import java.util.Scanner;

public class zad1 {

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
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input fahrenheit to celsius: \n");
        double numberFhr = input.nextInt();
        System.out.printf("Input Celsius to fahrenheit: \n");
        double numberCels = input.nextInt();
        int input_number = input.nextInt();
        System.out.printf("What would you choose: Fahrenheit or Clesius? : " + input_number);
        if(input_number == 1) {
            System.out.print("You chose fahrenheit\n" + calculateToCelsius(numberFhr));
        }
        if(input_number == 2) {
            System.out.print("You chose celsius\n" + calculateToFahrenheit(numberCels));
        }
    }

}
