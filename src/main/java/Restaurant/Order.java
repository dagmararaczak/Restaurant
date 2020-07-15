package Restaurant;


import java.util.Map;
import java.util.Set;

import Restaurant.MenuItems.Item;
import Restaurant.MenuItems.Wine;
import com.google.common.collect.Maps;

import lombok.Getter;

public class Order {

    public static final int BIG_ORDER = 100;

    @Getter
    private Map<Integer, Set<Item>> wholeOrder = Maps.newHashMap();

    public void addOrderItems(int orderId, Set<Item> items) {
        wholeOrder.put(orderId, items);
    }

    public void addFreeWine(Set<Item> orderItems, Wine wine) {
        orderItems.add(wine);
    }

}
