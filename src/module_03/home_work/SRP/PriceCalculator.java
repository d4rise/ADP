package module_03.home_work.SRP;

public class PriceCalculator {
    public double calculateTotal(Order order) {
        return order.getQuantity() * order.getPrice() * 0.9; // 10% скидка
    }
}
