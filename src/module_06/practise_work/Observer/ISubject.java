package module_06.practise_work.Observer;

public interface ISubject {
    void subscribe(String stockName, IObserver observer);
    void unsubscribe(String stockName, IObserver observer);
    void notifyObservers(String stockName);
}