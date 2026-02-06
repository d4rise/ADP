package module_03.practise_work;

class SmsNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS уведомление: " + message);
    }
}
