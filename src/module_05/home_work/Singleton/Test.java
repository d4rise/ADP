package module_05.home_work.Singleton;

public class Test {
    public static void main(String[] args) {

        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        config1.setSetting("theme", "dark");

        System.out.println("Theme from config2: " + config2.getSetting("theme"));

        System.out.println("Same instance? " + (config1 == config2));
    }
}