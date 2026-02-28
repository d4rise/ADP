package module_06.home_work.Strategy;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();

        System.out.println("Выберите способ оплаты:");
        System.out.println("1 - Банк карта");
        System.out.println("2 - PayPal");
        System.out.println("3 - Криптовалюта");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                context.setStrategy(new CreditCardPayment("1234-5678", "Mengo Men"));
                break;
            case 2:
                context.setStrategy(new PayPalPayment("belovedmypillow@mail.com"));
                break;
            case 3:
                context.setStrategy(new CryptoPayment("0xABC123"));
                break;
            default:
                System.out.println("Неправильный выбор!");
                return;
        }

        context.executePayment(50000);
    }
}
