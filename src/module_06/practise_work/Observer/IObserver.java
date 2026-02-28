package module_06.practise_work.Observer;

public interface IObserver {
    void update(String stockName, double price);
    String getName();
}