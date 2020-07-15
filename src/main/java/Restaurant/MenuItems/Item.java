package Restaurant.MenuItems;



import lombok.EqualsAndHashCode;
import lombok.Getter;

@EqualsAndHashCode
@Getter
public abstract class Item {
    private String name;
    private int count;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Item(String name, int count) {
        this.name = name;
        this.count = count;
    }
}
