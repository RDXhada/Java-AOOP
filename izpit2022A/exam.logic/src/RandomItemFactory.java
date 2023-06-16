import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

public interface RandomItemFactory extends Function<Integer, String>, Supplier<List<Item>> {
    Random GENERATOR = new Random();
    int BARCODE_SIZE = 5;

    default String apply(Integer num) {
        StringBuilder barcode = new StringBuilder();
        for (int i = 0; i < num; i++) {
            int randomIndex = GENERATOR.nextInt(2);
            if (randomIndex == 0) {
                barcode.append(":");
            } else {
                barcode.append("|");
            }
        }
        return barcode.toString();
    }

    private void setRandomData(List<Item> items, int count) {
        for (int i = 0; i < count; i++) {
            String barcode = apply(BARCODE_SIZE);
            int quantity = GENERATOR.nextInt(10) + 1;
            double price = GENERATOR.nextDouble() * 10 + 20;
            items.add(new Item(barcode, quantity, price));
        }
    }

    default List<Item> get() {
        List<Item> itemList = createList();
        int count = GENERATOR.nextInt(6) + 1;
        setRandomData(itemList, count);
        return itemList;
    }

    List<Item> createList();
}
