package module_03.practise_work;

class OrderService {
    private IPayment payment;
    private IDelivery delivery;
    private INotification notification;
    private DiscountCalculator discountCalculator;

    public OrderService(IPayment payment, IDelivery delivery, INotification notification, DiscountCalculator discountCalculator) {
        this.payment = payment;
        this.delivery = delivery;
        this.notification = notification;
        this.discountCalculator = discountCalculator;
    }

    public void checkout(Order order) {
        double subtotal = order.getSubTotal();
        double total = discountCalculator.calculate(subtotal);

        System.out.println("Итого к оплате: " + total);

        if (payment.processPayment(total)) {
            delivery.deliverOrder(order);
            notification.sendNotification("Ваш заказ успешно оформлен!");
        }
    }
}
