import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        MenuItem pizza = new MenuItem("Pizza", 12.99);
        MenuItem pasta = new MenuItem("Pasta", 8.99);
        restaurant.addMenuItem(pizza);
        restaurant.addMenuItem(pasta);

        List<MenuItem> items = new ArrayList<>();
        items.add(pizza);
        items.add(pasta);
        Order order1 = new Order(12,"John", items);
        restaurant.placeOrders(order1);

    }
}