package module_03.practise_work;
import java.util.*;

class Order {
    private List<OrderItem> items = new ArrayList<>();

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double getSubTotal() {
        return items.stream().mapToDouble(OrderItem::getTotalPrice).sum();
    }
}
