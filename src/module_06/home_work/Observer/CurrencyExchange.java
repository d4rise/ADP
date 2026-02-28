package module_06.home_work.Observer;
import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {

    private List<IObserver> observers = new ArrayList<>();
    private double rate;

    public void setRate(double rate) {
        this.rate = rate;
        System.out.println("\nКурс валюты изменился" +
                ": " + rate);
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(rate);
        }
    }
}
