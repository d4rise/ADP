package module_07.home_work.Command;

public class Thermostat {
    private int temperature = 20;

    public void increase(){
        temperature++;
        System.out.println("Temperature: " + temperature);
    }

    public void decrease(){
        temperature--;
        System.out.println("Temperature: " + temperature);
    }
}