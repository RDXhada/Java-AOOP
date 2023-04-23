public class Main {
    public static void main(String[] args)
    {
        int allNumbersCondition = 6 * 5 * 5 * 8 * 9; //10800
        int numbersDivisibleBy12 = allNumbersCondition / 12; //900

        double probability =  ((double)numbersDivisibleBy12/allNumbersCondition) * 100; //900 divided by 10800
        System.out.print("This is the output :  " + String.format("%.10f", probability) + "%");

    }
}