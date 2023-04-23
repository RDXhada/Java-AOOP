import java.text.NumberFormat;
import java.util.Random;

public class randomProbability {
    public static int drawRandomNumber()
    {
        Random random = new Random();
        double probability = random.nextDouble();
        if (probability < 0.2)
        {
            return 1;
        } else if (probability < 0.5)
        {
            return 2;
        } else {
            return 3;
        }
    }


    public static void main(String[] args) {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 1; i <= 10000; i++) {
            int number = drawRandomNumber();
            switch (number) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }

        NumberFormat percentFormat = NumberFormat.getPercentInstance();
        percentFormat.setMaximumFractionDigits(2);

        System.out.println("After 10,000 draws:");
        System.out.println("Number 1: " + percentFormat.format((double) count1 / 10000));
        System.out.println("Number 2: " + percentFormat.format((double) count2 / 10000));
        System.out.println("Number 3: " + percentFormat.format((double) count3 / 10000));
        System.out.println();

        count1 = 0;
        count2 = 0;
        count3 = 0;

        for (int i = 1; i <= 60000; i++) {
            int number = drawRandomNumber();
            switch (number) {
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
                case 3:
                    count3++;
                    break;
            }
        }

        System.out.println("After 60,000 draws:");
        System.out.println("Number 1: " + percentFormat.format((double) count1 / 60000));
        System.out.println("Number 2: " + percentFormat.format((double) count2 / 60000));
        System.out.println("Number 3: " + percentFormat.format((double) count3 / 60000));
    }
}