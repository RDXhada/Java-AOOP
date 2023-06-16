package exam.logic;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class InventoryManagement {
    RandomCategorySupplier supplier;
    List<Inventory> inventories;

    public InventoryManagement() {
        supplier = () -> {
            return new ArrayList<>();
        };
        inventories = supplier.getRandomData(10, 100, 500);
    }

    public String showInventory() {
        List<String> result = inventories.stream().map((element)->{
            return element.toString() +
                    "\n";
        }).collect(Collectors.toList());

        return result.toString();
    }

    public double averagePrice() {
        double result = inventories.stream().mapToDouble(Inventory::getPrice).average().getAsDouble();
        return result;
    }

    public List<Inventory> sortInventoryTypeAndID() {
        //сортиране в възходящ ред
        Collections.sort(inventories, Comparator.comparing(Inventory::getCategory));

        //сортиране в низходящ ред
        Collections.sort(inventories, Comparator.comparing(Inventory::getID).reversed());

        return inventories;
    }

    public String findTotalPricePerCategory() {
        Map<Category, Double> totalPricePerCategory = new HashMap<>();

        for (Inventory inventory : inventories) {
            Category category = inventory.getCategory();
            double price = inventory.getPrice();

            totalPricePerCategory.put(category, totalPricePerCategory.getOrDefault(category, 0.0) + price);
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Category, Double> entry : totalPricePerCategory.entrySet()) {
            Category category = entry.getKey();
            double totalPrice = entry.getValue();

            result.append("Category: ").append(category).append(", Total Price: ").append(totalPrice).append("\n");
        }

        return result.toString();
    }

}
