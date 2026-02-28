package module_06.practise_work.Strategy;

public class TravelBookingContext {

    private ICostCalculationStrategy strategy;

    public void setStrategy(ICostCalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(TravelDetails details) {

        if (strategy == null)
            throw new IllegalStateException("Strategy not selected!");

        return strategy.calculateCost(details);
    }
}
