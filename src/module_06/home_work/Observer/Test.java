package module_06.home_work.Observer;

public class Test {

    public static void main(String[] args) {

        CurrencyExchange exchange = new CurrencyExchange();

        IObserver bankApp = new BankAppObserver();
        IObserver mobileApp = new MobileAppObserver();
        IObserver investor = new InvestorObserver();

        exchange.addObserver(bankApp);
        exchange.addObserver(mobileApp);
        exchange.addObserver(investor);

        exchange.setRate(480);
        exchange.setRate(520);

        exchange.removeObserver(mobileApp);

        exchange.setRate(510);
    }
}
