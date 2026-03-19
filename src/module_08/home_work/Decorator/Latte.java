package module_08.home_work.Decorator;

public class Latte implements Beverage {
    public String getDescription() {
        return "Латте";
    }

    public double cost() {
        return 3.0;
    }
}
