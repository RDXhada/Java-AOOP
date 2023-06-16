package exam.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InventoryManagement {
    private RandomCategorySupplier supplier;
    private List<Inventory> inventories;

    public InventoryManagement() {
        supplier = () -> new ArrayList<>();
        inventories = supplier.get();
    }

    public String showInventory() {
        return inventories.stream()
                .map(Inventory::toString)
                .collect(Collectors.joining("\n"));
    }

    public double calculateAveragePrice() {
        double totalPrice = inventories.stream()
                .mapToDouble(Inventory::getPrice)
                .sum();
        return totalPrice / inventories.size();
    }

    public List<Inventory> sortInventoryTypeAndID() {
        return inventories.stream()
                .sorted(Comparator.comparing(Inventory::getCategory)
                        .thenComparing(Inventory::getID, Comparator.reverseOrder()))
                .collect(Collectors.toList());
    }

    public String findTotalPricePerCategory() {
        Map<Category, Double> totalPricePerCategory = inventories.stream()
                .collect(Collectors.groupingBy(Inventory::getCategory,
                        Collectors.summingDouble(Inventory::getPrice)));

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Category, Double> entry : totalPricePerCategory.entrySet()) {
            Category category = entry.getKey();
            double totalPrice = entry.getValue();
            result.append("Category: ").append(category).append(", Total Price: ").append(totalPrice).append("\n");
        }
        return result.toString();
    }
}

