package module_08.home_work.Decorator;

public class WhippedCream extends BeverageDecorator {

    public WhippedCream(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescription() + ", Взбитые сливки";
    }

    public double cost() {
        return beverage.cost() + 0.7;
    }
}
