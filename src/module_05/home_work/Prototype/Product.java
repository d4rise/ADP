package module_05.home_work.Prototype;

public class Product implements Cloneable {

    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    protected Product clone() {
        return new Product(name, price, quantity);
    }

    @Override
    public String toString() {
        return name + " x" + quantity + " ($" + price + ")";
    }
}