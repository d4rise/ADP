package module_06.practise_work.Observer;

public class Trader implements IObserver {

    private String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("Trader " + name +
                " received update: " + stockName + " = " + price);
    }

    @Override
    public String getName() {
        return name;
    }
}