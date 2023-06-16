package exam.logic;

import java.util.ArrayList;
import java.util.List;

public enum Category {
    A(0, List.of("Supplier1", "Supplier2")),
    B(1, List.of("Supplier3", "Supplier4")),
    C(2, List.of("Supplier5")),
    D(3, List.of("Supplier6", "Supplier7", "Supplier8"));

    private int reorderQty;
    private List<String> suppliers;

    Category(int reorderQty, List<String> suppliers) {
        setReorderQty(reorderQty);
        setSuppliers(suppliers);
    }

    public int getReorderQty() {
        return reorderQty;
    }

    public List<String> getSuppliers() {
        return suppliers;
    }

    public void setReorderQty(int reorderQty) {
        if(reorderQty < 0) {
            this.reorderQty = 0;
        }
        this.reorderQty = reorderQty;
    }

    public void setSuppliers(List<String> suppliers) {
        if(suppliers == null)
        {
            this.suppliers = new ArrayList<>();
        }
        this.suppliers = suppliers;
    }
}
