public class Item {
    private String BARCODE;
    private int quantity;
    private double price;

    public Item(String BARCODE, int quantity, double price) {
        setBARCODE(BARCODE);
        setQuantity(quantity);
        setPrice(price);
    }

    public String getBARCODE() {
        return BARCODE;
    }

    public void setBARCODE(String BARCODE) {
        if(BARCODE == null)
        {
            this.BARCODE = "NO_BARCODE";
        }
        this.BARCODE = BARCODE;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0)
        {
            this.quantity = 0;
        }
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0)
        {
            this.price = 0;
        }
        this.price = price;
    }

    @Override
    public String toString()
    {
            return String.format("BARCODE: %s, quantity: %d, price: %.2f", BARCODE, quantity, price);
    }
}
