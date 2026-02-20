package module_05.practise_work.Singleton;
import java.io.*;

public class LogReader {

    public static void read(String path, LogLevel level) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(level.name())) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}