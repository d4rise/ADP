package module_07.home_work.Command;

public class LightOffCommand implements ICommand {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.off();
    }

    public void undo(){
        light.on();
    }
}