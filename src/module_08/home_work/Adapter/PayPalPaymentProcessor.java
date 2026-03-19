package module_08.home_work.Adapter;

public class PayPalPaymentProcessor implements IPaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Оплачено " + amount + " с помощью PayPal");
    }
}
