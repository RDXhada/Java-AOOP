import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Invoice {
    private static final String ID = "%01d";
    private String uniqueID;
    private List<Item> items;

    public Invoice(List<Item> items) {
        this.uniqueID = String.format(ID, 0);
        this.items = new ArrayList<>();
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(String uniqueID) {
        if(uniqueID == null)
        {
            this.uniqueID = String.format(ID, 0);
        }
        this.uniqueID = uniqueID;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        if(items == null)
        {
            this.items = new ArrayList<>();
        }
        this.items = items;
    }

    public double totalInvoicePrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getQuantity() * item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice ID: ").append(uniqueID).append("\n");
        Collections.sort(items, Comparator.comparing(Item::getBARCODE));
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        sb.append("Total Invoice Price: ").append(totalInvoicePrice());
        return sb.toString();
    }
}
