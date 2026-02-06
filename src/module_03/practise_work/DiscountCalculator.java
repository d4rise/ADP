package module_03.practise_work;
import java.util.*;

class DiscountCalculator {
    private List<DiscountRule> rules = new ArrayList<>();

    public void addRule(DiscountRule rule) {
        rules.add(rule);
    }

    public double calculate(double amount) {
        double result = amount;
        for (DiscountRule rule : rules) {
            result = rule.apply(result);
        }
        return result;
    }
}
