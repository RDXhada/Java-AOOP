import java.util.ArrayList;
import java.lang.Math;

public class ProbabilityProblem3 {
    public static void main(String[] arguments) {
        int counter = 0;
        int counterOfNumbersDivisibleBy12 = 0;

        for (int a = 1; a <= 6; a++)
            for (int b = 4; b <= 8; b++)
                for (int c = 3; c <= 7; c++)
                    for (int d = 1; d <= 9; d++)
                        for (int e = 1; e <= 8; e++) {
                            int number = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
                            if (number % 12 == 0) {
                                counterOfNumbersDivisibleBy12++;
                            }
                            counter++;
                        }
        double probability = ((double) counterOfNumbersDivisibleBy12 / counter) * 100;
        System.out.println("Count of numbers with our given properties [1,6] [4,8] [3,7] [1,9] [1,8]: " + counter);
        System.out.println("Count of numbers divisible by 12: " + counterOfNumbersDivisibleBy12);
        System.out.println("Probability of a number with the given properties being divisible by 12: " + String.format("%.10f", probability) + "%");
    }
}
