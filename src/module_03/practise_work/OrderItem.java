package module_03.practise_work;
import java.util.*;

class OrderItem {
    private String name;
    private int quantity;
    private double price;

    public OrderItem(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = quantity;
        this.price = price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}
