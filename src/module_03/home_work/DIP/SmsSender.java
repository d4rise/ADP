package module_03.home_work.DIP;

public class SmsSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

