import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    private int[][] dataArray;

    private void fillMatrix(int size) {
        Random rand = new Random();

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                this.dataArray[i][j] = rand.nextInt(9);
    }

    public SquareMatrix() {
        this(2);
    }

    public SquareMatrix(SquareMatrix other) {
        int size = other.dataArray.length;
        this.dataArray = new int[size][size];
        for (int i = 0; i < size; i++)
            System.arraycopy(other.dataArray[i], 0, this.dataArray[i], 0, size);
    }

    public SquareMatrix(int size) {
        if (size < 2 || size > 12)
            throw new RuntimeException("Invalid size");
        this.dataArray = new int[size][size];
        fillMatrix(size);
    }

    public int[][] getDataArray() {
        int size = this.dataArray.length;
        int[][] copy = new int[size][size];
        for (int i = 0; i < size; i++)
            System.arraycopy(this.dataArray[i], 0, copy[i], 0, size);
        return copy;
    }

    public void setDataArray(int[][] dataArray) {
        int size = dataArray.length;
        if (size != dataArray[0].length || size < 2 || size > 12)
            throw new RuntimeException("Invalid matrix size");
        this.dataArray = new int[size][size];
        for (int i = 0; i < size; i++)
            System.arraycopy(dataArray[i], 0, this.dataArray[i], 0, size);
    }

    @Override
    public String toString() {
        StringBuilder value = new StringBuilder();
        for (int[] row : this.dataArray)
            value.append(Arrays.toString(row)).append('\n');
        return value.toString();
    }

    public int findMaxSum() {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < this.dataArray.length - 1; i++)
            for (int j = 0; j < this.dataArray.length - 1; j++)
                sum = Math.max(sum, this.dataArray[i][j] + this.dataArray[i][j + 1] + this.dataArray[i + 1][j] + this.dataArray[i + 1][j + 1]);
        return sum;
    }

    public void printAll() {
        int maxSum = findMaxSum();
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        for (int i = 0; i < this.dataArray.length - 1; i++)
            for (int j = 0; j < this.dataArray.length - 1; j++)
                if (this.dataArray[i][j] + this.dataArray[i][j + 1] + this.dataArray[i + 1][j] + this.dataArray[i + 1][j + 1] == maxSum) {
                    rows.add(i);
                    cols.add(j);
                }

        System.out.print("Submatrices with maximum sum: ");
        for (int i = 0; i < rows.size(); i++)
            System.out.printf("[%d, %d] ", rows.get(i), cols.get(i));
        System.out.println();
    }
}
