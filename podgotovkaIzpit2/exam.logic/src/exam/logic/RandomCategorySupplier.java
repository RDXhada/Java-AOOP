package exam.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.Random;


public interface RandomCategorySupplier extends Supplier<List<Inventory>>{
    final Random RANDOM = null;

    private void updateType(Category type)
    {
        type.getSuppliers().clear();
        int n = RANDOM.nextInt(5) + 1;

        for (int i = 0; i < n; i++) {
            type.getSuppliers().add(String.format("%s Supplier %d", type.toString(), i));
        }

        type.setReorderQty(RANDOM.nextInt(10*n) + 1);
    }

    default List<Inventory> getRandomData(int howMany, int a, int b) {
        List<Inventory> list = new ArrayList<>();

        for (int i = 0; i < howMany; i++) {
            int categoryNumber = RANDOM.nextInt(4) + 1;
            double salary = (RANDOM.nextDouble() % (b-a)) + a;
            Category temp;
            switch (categoryNumber)
            {
                case 1: temp = Category.A; break;
                case 2: temp = Category.B; break;
                case 3: temp = Category.C; break;
                case 4: temp = Category.D; break;
                default: temp = Category.A; break;
            }

            list.add(new Inventory(Integer.toString(i), temp, salary));
        }

        return list;
    }


}
