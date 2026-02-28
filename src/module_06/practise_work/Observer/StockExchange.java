package module_06.practise_work.Observer;
import java.util.*;
import java.util.concurrent.*;

public class StockExchange implements ISubject {

    private Map<String, Double> stocks = new HashMap<>();
    private Map<String, List<IObserver>> observers = new HashMap<>();

    @Override
    public void subscribe(String stockName, IObserver observer) {
        observers.computeIfAbsent(stockName, k -> new ArrayList<>()).add(observer);
        System.out.println(observer.getName() + " subscribed to " + stockName);
    }

    @Override
    public void unsubscribe(String stockName, IObserver observer) {
        observers.getOrDefault(stockName, new ArrayList<>()).remove(observer);
        System.out.println(observer.getName() + " unsubscribed from " + stockName);
    }

    @Override
    public void notifyObservers(String stockName) {
        for (IObserver observer : observers.getOrDefault(stockName, new ArrayList<>())) {
            CompletableFuture.runAsync(() ->
                    observer.update(stockName, stocks.get(stockName)));
        }
    }

    public void setStockPrice(String stockName, double price) {
        stocks.put(stockName, price);
        System.out.println("Stock " + stockName + " updated: " + price);
        notifyObservers(stockName);
    }
}