package module_08.home_work.Decorator;

public class Espresso implements Beverage {
    public String getDescription() {
        return "Эспрессо";
    }

    public double cost() {
        return 2.0;
    }
}
