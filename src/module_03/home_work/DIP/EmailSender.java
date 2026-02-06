package module_03.home_work.DIP;

public class EmailSender implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}
