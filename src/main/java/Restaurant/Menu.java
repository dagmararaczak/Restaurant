package Restaurant;

import java.util.Set;
import Restaurant.MenuItems.Fish;
import Restaurant.MenuItems.Item;
import Restaurant.MenuItems.Meat;
import Restaurant.MenuItems.Pasta;
import com.google.common.collect.Sets;
import lombok.Getter;

public class Menu {

    @Getter
    private Set<Item> menu = Sets.newHashSet();

    public void init() {
        menu.add(new Meat("Schabowy", 10d));
        menu.add(new Meat("Mielone", 20d));
        menu.add(new Pasta("Carbonara", 10d));
        menu.add(new Fish("Fladra", 10d));
        menu.add(new Fish("Sledzik", 30d));
    }
}
