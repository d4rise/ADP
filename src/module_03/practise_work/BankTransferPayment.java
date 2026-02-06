package module_03.practise_work;

class BankTransferPayment implements IPayment {
    @Override
    public boolean processPayment(double amount) {
        System.out.println("Банковский перевод: " + amount);
        return true;
    }
}
