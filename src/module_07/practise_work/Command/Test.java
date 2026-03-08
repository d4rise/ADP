package module_07.practise_work.Command;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        Light light = new Light();

        ICommand lightOn = new LightOnCommand(light);
        ICommand lightOff = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton();

        remote.undo();

        MacroCommand macro = new MacroCommand(Arrays.asList(lightOn, lightOff));

        remote.setCommand(macro);
        remote.pressButton();
    }
}
