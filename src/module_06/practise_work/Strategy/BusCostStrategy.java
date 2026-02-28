package module_06.practise_work.Strategy;

public class BusCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelDetails d) {

        double baseRate = 0.1;
        double cost = d.getDistance() * baseRate;

        cost += d.getBaggageCount() * 5;

        if (d.isChildDiscount())
            cost *= 0.95;

        if (d.isPensionerDiscount())
            cost *= 0.9;

        return cost * d.getPassengers();
    }
}