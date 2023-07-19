import java.util.Random;

public class SquareMatrixTest {

    public static void main(String[] args) {
        Random rand = new Random();
        int upperBound = 12;
        int lowerBound = 5;

        int size = rand.nextInt(upperBound - lowerBound) + lowerBound;

        SquareMatrix test = new SquareMatrix(size);

        System.out.println(test.toString());

        System.out.println("Max sum: " + test.findMaxSum());
        test.printAll();
    }
}