import java.util.Scanner;

//exercise to determine temperature celsius to fahrenheit and fahrenheit to celsius
public class Problem1 {

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
        System.out.print("Choose your number: ");
        double inputNumber = input.nextDouble();
        System.out.printf("What would you choose to convert : Fahrenheit->Celsius or Celsius->Fahrenheit? (pick between 1 or 2): ");
        byte input_number = input.nextByte();
        if(input_number == 1) {
            System.out.print("You chose Fahrenheit to Celsius\n" + calculateToCelsius(inputNumber));
        }
        if(input_number == 2) {
            System.out.print("You chose Celsius to Fahrenheit\n" + calculateToFahrenheit(inputNumber));
        }
    }

}
