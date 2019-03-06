package Backpack;



import java.util.LinkedList;
import java.util.List;


class Backpack {
    private final int maxWeight;

    private int bestPrice;
    private List<Item> bestItems = null;


    Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    private int calcWeight(List<Item> items) {
        int sumWeight = 0;
        for (Item item : items) {
            sumWeight += item.weight;
        }
        return sumWeight;
    }

    private int calcPrice(List<Item> items) {
        int sumPrice = 0;
        for (Item item : items) {
            sumPrice += item.price;
        }
        return sumPrice;
    }

    private void bestSet(List<Item> items) {
        if (bestItems == null) {
            if (calcWeight(items) <= maxWeight) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        } else {
            if (calcWeight(items) <= maxWeight && calcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    void calcBestSet(List<Item> items) {
        if (items.size() > 0) {
            bestSet(items);
        }
        for (int i = 0; i < items.size(); i++) {
            List<Item> list = new LinkedList<>(items);
            list.remove(i);
            calcBestSet(list);
        }
    }


            List<Item> getBestSet () {
                return bestItems;
            }

            int getBestPrice () {
                return bestPrice;
            }


    int getMaxWeight() {
        return maxWeight;
    }
}
