package module_06.home_work.Observer;

public class MobileAppObserver implements IObserver {

    @Override
    public void update(double rate) {
        System.out.println("Mobile App: Push увед. отправлено. Курс = " + rate);
    }
}
