
package module_07.practise_work.Command;

public class LightOnCommand implements ICommand {

    private Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo(){
        light.off();
    }
}
