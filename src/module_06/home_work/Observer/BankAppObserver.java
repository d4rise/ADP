package module_06.home_work.Observer;

public class BankAppObserver implements IObserver {

    @Override
    public void update(double rate) {
        System.out.println("Bank App: Новый курс = " + rate);
    }
}
