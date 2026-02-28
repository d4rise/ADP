package module_06.home_work.Observer;

public class InvestorObserver implements IObserver {

    @Override
    public void update(double rate) {
        if (rate > 500) {
            System.out.println("Investor: Валюта подорожала! Нужно продать!");
        } else {
            System.out.println("Investor: Валюта подешевела! Нужно купить!");
        }
    }
}