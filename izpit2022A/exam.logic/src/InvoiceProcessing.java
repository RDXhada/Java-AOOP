import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class InvoiceProcessing implements RandomItemFactory {
    private List<Invoice> invoices;

    public InvoiceProcessing(int count) {
        this.invoices = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            List<Item> items = get();
            invoices.add(new Invoice(items));
        }
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public String showInvoices() {
        return invoices.stream()
                .map(Invoice::toString)
                .collect(Collectors.joining("\n"));
    }

    public double calculateTotalPrice() {
        return invoices.stream()
                .mapToDouble(Invoice::totalInvoicePrice)
                .sum();
    }

    public String showSortedByPriceInvoices() {
        StringBuilder sb = new StringBuilder();
        sb.append("The invoices sorted by total price of invoice:\n");
        sb.append("Price:\n");
        invoices.stream()
                .sorted(Comparator.comparingDouble(Invoice::totalInvoicePrice))
                .forEach(invoice -> {
                    sb.append(invoice.totalInvoicePrice()).append(":\n");
                    sb.append(invoice.toString()).append("\n");
                });
        return sb.toString();
    }

    public String printTotalByBarcode() {
        StringBuilder sb = new StringBuilder();
        invoices.stream()
                .flatMap(invoice -> invoice.getItems().stream())
                .collect(Collectors.groupingBy(Item::getBARCODE, Collectors.counting()))
                .entrySet().stream()
                .sorted(Comparator.comparingLong(entry -> -entry.getValue()))
                .forEach(entry -> sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n"));
        return sb.toString();
    }

    @Override
    public List<Item> createList() {
        return new ArrayList<>();
    }
}
