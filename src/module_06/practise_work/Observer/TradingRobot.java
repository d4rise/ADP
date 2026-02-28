package module_06.practise_work.Observer;

public class TradingRobot implements IObserver {

    private String name;
    private double threshold;

    public TradingRobot(String name, double threshold) {
        this.name = name;
        this.threshold = threshold;
    }

    @Override
    public void update(String stockName, double price) {

        if (price > threshold)
            System.out.println("Robot " + name + " SELL " + stockName);
        else
            System.out.println("Robot " + name + " BUY " + stockName);
    }

    @Override
    public String getName() {
        return name;
    }
}