package module_08.home_work.Adapter;

public class CryptoPaymentAdapter implements IPaymentProcessor {

    private CryptoPaymentService cryptoService;

    public CryptoPaymentAdapter(CryptoPaymentService cryptoService) {
        this.cryptoService = cryptoService;
    }

    @Override
    public void processPayment(double amount) {
        cryptoService.sendCrypto(amount);
    }
}
