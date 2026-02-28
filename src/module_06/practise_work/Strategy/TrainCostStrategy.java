package module_06.practise_work.Strategy;

public class TrainCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelDetails d) {

        double baseRate = 0.2;
        double cost = d.getDistance() * baseRate;

        if (d.getServiceClass().equalsIgnoreCase("business"))
            cost *= 1.4;

        cost += d.getBaggageCount() * 10;

        if (d.isChildDiscount())
            cost *= 0.9;

        if (d.isPensionerDiscount())
            cost *= 0.85;

        return cost * d.getPassengers();
    }
}