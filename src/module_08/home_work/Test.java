package module_08.home_work;
import module_08.home_work.Decorator.*;
import module_08.home_work.Adapter.*;

public class Test {
    public static void main(String[] args) {

        Beverage drink = new Espresso();
        drink = new Milk(drink);
        drink = new Sugar(drink);
        drink = new WhippedCream(drink);

        System.out.println(drink.getDescription());
        System.out.println("Общая стоимость: " + drink.cost());

        System.out.println("------------------");

        Beverage drink2 = new Latte();
        drink2 = new Milk(drink2);
        drink2 = new Milk(drink2);

        System.out.println(drink2.getDescription());
        System.out.println("Общая стоимость: " + drink2.cost());

        System.out.println("------------------");

        IPaymentProcessor paypal = new PayPalPaymentProcessor();
        paypal.processPayment(100);

        IPaymentProcessor stripe = new StripePaymentAdapter(new StripePaymentService());
        stripe.processPayment(200);

        IPaymentProcessor crypto = new CryptoPaymentAdapter(new CryptoPaymentService());
        crypto.processPayment(300);
    }
}
