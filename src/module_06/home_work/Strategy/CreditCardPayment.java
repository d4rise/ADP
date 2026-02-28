package module_06.home_work.Strategy;

public class CreditCardPayment implements IPaymentStrategy {

    private String cardNumber;
    private String holderName;

    public CreditCardPayment(String cardNumber, String holderName) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " тг оплачено (Банк карта: " + holderName + ")");
    }
}