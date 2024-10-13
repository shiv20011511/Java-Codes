import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Item {
    String name;
    int weight;
    int value;
    double valuePerWeight;

    public Item(String name, int weight, int value) {
        this.name = name;
        this.weight = weight;
        this.value = value;
        this.valuePerWeight = (double) value / weight;
    }
}

public class KnapsackBranchAndBound {
    static int capacity;
    static int maxVal;
    static ArrayList<String> selection;

    public static void knapsackBranchBound(Item[] items, int capacity) {
        KnapsackBranchAndBound.capacity = capacity;
        maxVal = 0;
        selection = new ArrayList<>();
        ArrayList<Item> itemList = new ArrayList<>();
        Collections.addAll(itemList, items);
        itemList.sort(Comparator.comparingDouble(o -> -o.valuePerWeight));
        branch(0, 0, itemList);
    }

    private static void branch(int currentWeight, int currentValue, ArrayList<Item> remainingItems) {
        if (currentWeight > capacity) return;
        if (currentValue > maxVal) {
            maxVal = currentValue;
            selection.clear();
            for (Item item : remainingItems) {
                selection.add(item.name);
            }
        }
        if (remainingItems.isEmpty()) return;
        if (bound(currentWeight, currentValue, remainingItems) <= maxVal) return;

        Item firstItem = remainingItems.get(0);
        ArrayList<Item> withoutFirstItem = new ArrayList<>(remainingItems);
        withoutFirstItem.remove(0);

        branch(currentWeight + firstItem.weight, currentValue + firstItem.value, withoutFirstItem);
        branch(currentWeight, currentValue, withoutFirstItem);
    }

    private static double bound(int currentWeight, int currentValue, ArrayList<Item> remainingItems) {
        double boundValue = currentValue;
        int boundWeight = currentWeight;
        for (Item item : remainingItems) {
            if (boundWeight + item.weight <= capacity) {
                boundValue += item.value;
                boundWeight += item.weight;
            } else {
                boundValue += (capacity - boundWeight) * item.valuePerWeight;
                break;
            }
        }
        return boundValue;
    }

    public static void main(String[] args) {
        Item i1 = new Item("i1", 1, 2);
        Item i2 = new Item("i2", 2, 3);
        Item i3 = new Item("i3", 3, 4);

        Item[] items = {i1, i2, i3};
        int capacity = 3;

        knapsackBranchBound(items, capacity);

        System.out.println("Maximum value: " + maxVal);
        System.out.println("Selected items: " + selection);
    }
}
