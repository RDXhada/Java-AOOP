package exam.logic;

import java.util.List;
import java.util.function.Supplier;
import java.util.Random;
import java.util.ArrayList;

public interface RandomCategorySupplier extends Supplier<List<Inventory>> {
    Random RANDOM = new Random();

    default void updateType(Category type) {
        type.getSuppliers().removeIf(supplier -> supplier.startsWith(type.toString()));
        int randomCount = RANDOM.nextInt(5) + 1;
        for (int i = 1; i <= randomCount; i++) {
            String supplier = type.toString() + "Supplier " + i;
            type.getSuppliers().add(supplier);
        }
        int reorderQty = RANDOM.nextInt(type.getSuppliers().size() * 10) + 1;
        type.setReorderQty(reorderQty);
    }
    default List<Inventory> getRandomData(int howMany, int a, int b) {
        List<Inventory> inventoryList = new ArrayList<>();
        howMany = 10;
        a = 1;
        b = 100;

        for (int i = 0; i < howMany; i++) {
            Category randomCategory = Category.values()[RANDOM.nextInt(Category.values().length)];
            double randomPrice = a + (b - a) * RANDOM.nextDouble();
            Inventory inventory = new Inventory(Integer.toString(i + 1), randomCategory, randomPrice);
            updateType(randomCategory);
            inventoryList.add(inventory);
        }

        return inventoryList;
    }
}
