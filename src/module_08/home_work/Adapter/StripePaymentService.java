package module_08.home_work.Adapter;

public class StripePaymentService {

    public void makeTransaction(double totalAmount) {
        System.out.println("Stripe обработал платеж: " + totalAmount);
    }
}
