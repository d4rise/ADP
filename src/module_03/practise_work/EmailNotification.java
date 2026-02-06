package module_03.practise_work;

class EmailNotification implements INotification {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email уведомление: " + message);
    }
}
