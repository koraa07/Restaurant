import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Restaurant {
    List<Order> orders;
    List<MenuItem> menu;
    
   public void addMenuItem(MenuItem item){
       menu.add(item);
   }

   public void placeOrders(Order order){
       orders.add(order);
   }

   public Order getOrderById(int orderId){
       for (Order order : orders){
           if (order.getOrderId() == orderId) {
               return order;
           }
       }
       throw new IllegalArgumentException("Заказ не найден");
   }

   public void completeOrder(int orderId){
       Order order = getOrderById(orderId);
       if (order.isCompleted()) {
           throw new IllegalStateException("Заказ уже готов");
       }
       order.completeOrder();
   }

   public void checkMenuItem(String itemName){
       for (MenuItem item : menu){
           if (item.getName().equals(itemName)){
               return;
           }
       }
       throw new NoSuchElementException("Menu item not found.");
   }
}

