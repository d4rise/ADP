package module_06.home_work.Strategy;

public class PayPalPayment implements IPaymentStrategy {

    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " тг оплачено (PayPal аккаунт: " + email + ")");
    }
}