package module_08.home_work.Decorator;

public class Tea implements Beverage {
    public String getDescription() {
        return "Чай";
    }

    public double cost() {
        return 1.5;
    }
}
