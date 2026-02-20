package module_05.practise_work.Singleton;
import java.io.*;
import java.time.LocalDateTime;

public class Logger {

    private static volatile Logger instance;
    private static final Object lock = new Object();

    private LogLevel currentLevel;
    private String filePath;

    private Logger(LoggerConfig config) {
        this.currentLevel = config.getLevel();
        this.filePath = config.getFilePath();
    }

    public static Logger getInstance(LoggerConfig config) {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new Logger(config);
                }
            }
        }
        return instance;
    }

    public void setLogLevel(LogLevel level) {
        this.currentLevel = level;
    }

    public synchronized void log(String message, LogLevel level) {
        if (level.ordinal() < currentLevel.ordinal()) return;

        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(LocalDateTime.now() + " [" + level + "] " + message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}