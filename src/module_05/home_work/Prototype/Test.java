package module_05.home_work.Prototype;

public class Test {
    public static void main(String[] args) {

        Order originalOrder = new Order();
        originalOrder.addProduct(new Product("Laptop", 1000, 1));
        originalOrder.setDeliveryCost(20);
        originalOrder.setDiscount(new Discount("New Year", 10));
        originalOrder.setPaymentMethod("Credit Card");

        Order clonedOrder = originalOrder.clone();
        clonedOrder.setPaymentMethod("Cash");

        System.out.println("Original Order:");
        System.out.println(originalOrder);

        System.out.println("\nCloned Order:");
        System.out.println(clonedOrder);
    }
}