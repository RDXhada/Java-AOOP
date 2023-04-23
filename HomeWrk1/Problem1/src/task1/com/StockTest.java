package task1.com;

import java.util.Scanner;
public class StockTest {

    //NOTE : YOU HAVE TO INPUT YOUR OWN VALUES
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String symbol, name;
        double previous_price , current_price;

        System.out.println("Enter new com.Stock symbol: ");
        symbol = input.next();
        System.out.println("Enter new com.Stock name: ");
        name = input.next();

        Stock stk = new Stock(symbol,name);

        System.out.println("Enter previous closing price");
        previous_price = input.nextDouble();
        stk.setPreviousClosingPrice(previous_price);

        System.out.println("Enter current price: ");
        current_price = input.nextDouble();
        stk.setCurrentPrice(current_price);

        System.out.println("Symbol is : " + stk.getSymbol());
        System.out.println("Name is : " + stk.getName());
        System.out.println("Previous closing price is: " + stk.getPreviousClosingPrice());
        System.out.println("Current price is : " + stk.getCurrentPrice());
        System.out.println("Change percent is : " + stk.changePercent() + "%");
        //test cases
        System.out.print("Test cases are: \n");
        System.out.println(stk.getSymbol() == symbol);
        System.out.println(stk.getName() == name);
        System.out.println(stk.getPreviousClosingPrice() == previous_price);
        System.out.println(stk.getCurrentPrice() == current_price);
        System.out.println(stk.changePercent() == (current_price - previous_price) / current_price * 100);


    }
}