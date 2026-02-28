package module_06.home_work.Strategy;

public class CryptoPayment implements IPaymentStrategy {

    private String walletAddress;

    public CryptoPayment(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.println(amount + " тг оплачено (Crypto wallet: " + walletAddress + ")");
    }
}