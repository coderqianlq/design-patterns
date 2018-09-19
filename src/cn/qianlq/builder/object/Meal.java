package cn.qianlq.builder.object;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianliqing
 * @date 2018/4/11 下午2:19
 * email: qianlq0824@gmail.com
 */

public class Meal {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}
