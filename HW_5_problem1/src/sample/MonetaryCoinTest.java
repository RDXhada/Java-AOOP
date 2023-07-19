package sample;

public class MonetaryCoinTest {

    public static void main(String[] args) {
        MonetaryCoin[] coins = new MonetaryCoin[5];
        coins[0] = new MonetaryCoin(Face.TAIL, 3);
        coins[1] = new MonetaryCoin(Face.HEADS, 4);
        coins[2] = new MonetaryCoin(Face.HEADS, 2);
        coins[3] = new MonetaryCoin(Face.TAIL, 10);
        coins[4] = new MonetaryCoin(Face.HEADS, 7);

        int sumOfCoins = 0;
        for (MonetaryCoin coin : coins ) {  //do it for every coin in coins
            coin.flip();
            System.out.println(coin); //.toString()
            sumOfCoins += coin.getValue();
        }

        System.out.printf("The sum of the coins is %d", sumOfCoins);
    }
}