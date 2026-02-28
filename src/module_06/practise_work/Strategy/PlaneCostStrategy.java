package module_06.practise_work.Strategy;

public class PlaneCostStrategy implements ICostCalculationStrategy {

    @Override
    public double calculateCost(TravelDetails d) {

        double baseRate = 0.5;
        double cost = d.getDistance() * baseRate;

        if (d.getServiceClass().equalsIgnoreCase("business"))
            cost *= 1.8;

        cost += d.getBaggageCount() * 20;

        if (d.isChildDiscount())
            cost *= 0.8;

        if (d.isPensionerDiscount())
            cost *= 0.85;

        return cost * d.getPassengers();
    }
}