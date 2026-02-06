package module_03.practise_work;

class CreditCardPayment implements IPayment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Оплата картой: " + amount);
        return true;
    }
}
