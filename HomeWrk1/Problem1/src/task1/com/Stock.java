package task1.com;
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;
    public Stock(String symbol,String name)
    {
        this.symbol = symbol != null ? symbol : "No such symbol!";
        this.name = name != null ? name : "No such name!";
        setPreviousClosingPrice(0);
        setCurrentPrice(0);
    }

    //symbol getter
    public String getSymbol()
    {
        return symbol;
    }
    //name getter
    public String getName()
    {
        return name;
    }
    //previous closing price getter
    public double getPreviousClosingPrice()
    {
        return previousClosingPrice;
    }
    //current price getter
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    //previous closing price setter
    public void setPreviousClosingPrice(double prev_price)
    {
        this.previousClosingPrice = prev_price > 0 ? prev_price : 0;
    }
    //current price setter
    public void setCurrentPrice(double curr_price)
    {
        this.currentPrice = curr_price > 0 ? curr_price : 0;
    }

    //change percentage
    public double changePercent()
    {
        return ((currentPrice - previousClosingPrice) / currentPrice) * 100;
    }
}