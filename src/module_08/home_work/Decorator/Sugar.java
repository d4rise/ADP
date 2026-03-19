package module_08.home_work.Decorator;

public class Sugar extends BeverageDecorator {

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Сахар";
    }

    public double cost() {
        return beverage.cost() + 0.2;
    }
}
