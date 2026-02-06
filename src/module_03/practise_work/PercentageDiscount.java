package module_03.practise_work;

class PercentageDiscount implements DiscountRule {
    private double percent;

    public PercentageDiscount(double percent) {
        this.percent = percent;
    }

    @Override
    public double apply(double amount) {
        return amount - (amount * percent / 100);
    }
}
