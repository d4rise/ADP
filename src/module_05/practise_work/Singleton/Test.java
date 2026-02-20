package module_05.practise_work.Singleton;

public class Test {
    public static void main(String[] args) {

        LoggerConfig config = new LoggerConfig(LogLevel.INFO, "app.log");
        Logger logger = Logger.getInstance(config);

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                logger.log("Сообщение от " + Thread.currentThread().getName(), LogLevel.INFO);
            }
        };

        new Thread(task).start();
        new Thread(task).start();
        new Thread(task).start();
    }
}