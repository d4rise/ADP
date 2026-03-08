package module_07.home_work.Command;

public class Test {

    public static void main(String[] args) {

        Light light = new Light();
        Door door = new Door();
        Thermostat thermostat = new Thermostat();
        TV tv = new TV();

        Invoker remote = new Invoker();

        remote.executeCommand(new LightOnCommand(light));
        remote.executeCommand(new DoorOpenCommand(door));
        remote.executeCommand(new TempUpCommand(thermostat));
        remote.executeCommand(new TVOnCommand(tv));

        System.out.println("Undo operations:");
        remote.undo();
        remote.undo();
    }
}