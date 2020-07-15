package Restaurant;

import static Restaurant.Order.BIG_ORDER;
import java.util.Set;
import Restaurant.MenuItems.Item;
import Restaurant.MenuItems.Wine;
import lombok.Getter;

public class Restaurant {
	
	@Getter
	Menu menu = new Menu();
	
	@Getter
	Order wholeOrder = new Order();
	
	public Restaurant() {
		menu.init();
	}
	
	public void collectOrder(int orderId, Set<Item> orderItems, Wine extraWine) {
		
		int orderSize = orderItems.size();
		
		if (orderSize > BIG_ORDER) {
			wholeOrder.addOrderItems(orderId, orderItems);
			wholeOrder.addFreeWine(orderItems, extraWine);
		} else {
			wholeOrder.addOrderItems(orderId, orderItems);
		}
	}
	
}
