package module_08.home_work.Decorator;

public class Matcha implements Beverage {
    public String getDescription() {
        return "Матча";
    }

    public double cost() {
        return 3.5;
    }
}
