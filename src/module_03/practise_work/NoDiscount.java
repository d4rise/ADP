package module_03.practise_work;

class NoDiscount implements DiscountRule {
    @Override
    public double apply(double amount) {
        return amount;
    }
}