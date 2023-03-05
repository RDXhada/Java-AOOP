import java.util.Scanner;

public class Trigonometry {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x in radians: ");
        double x = scanner.nextDouble();
        double sinX = sin(x);
        double cosX = cos(x);
        System.out.println("sin(x) = " + sinX);
        System.out.println("cos(x) = " + cosX);
    }

    public static double sin(double x) {
        double sinX = 0;
        double term = x;
        int sign = 1;
        for (int i = 1; i <= 10; i++) {
            sinX += term;
            term *= (-1 * x * x) / ((2 * i) * (2 * i + 1));
            sign *= -1;
        }
        return sinX;
    }

    public static double cos(double x) {
        double cosX = 0;
        double term = 1;
        int sign = 1;
        for (int i = 1; i <= 10; i++) {
            cosX += term;
            term *= (-1 * x * x) / ((2 * i - 1) * (2 * i));
            sign *= -1;
        }
        return cosX;
    }
}
