package module_03.practise_work;

class PayPalPayment implements IPayment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Оплата через PayPal: " + amount);
        return true;
    }
}
