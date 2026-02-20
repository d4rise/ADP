package module_05.home_work.Prototype;

import java.util.ArrayList;
import java.util.List;

public class Order implements Cloneable {

    private List<Product> products;
    private double deliveryCost;
    private Discount discount;
    private String paymentMethod;

    public Order() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void setDeliveryCost(double deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    protected Order clone() {
        Order clonedOrder = new Order();
        for (Product product : products) {
            clonedOrder.addProduct(product.clone());
        }
        clonedOrder.setDeliveryCost(deliveryCost);
        if (discount != null) {
            clonedOrder.setDiscount(discount.clone());
        }
        clonedOrder.setPaymentMethod(paymentMethod);
        return clonedOrder;
    }

    @Override
    public String toString() {
        return "Products: " + products +
                "\nDelivery: " + deliveryCost +
                "\nDiscount: " + discount +
                "\nPayment: " + paymentMethod;
    }
}