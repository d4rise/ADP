package module_08.home_work.Decorator;

public class Milk extends BeverageDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Молоко";
    }

    public double cost() {
        return beverage.cost() + 0.5;
    }
}
