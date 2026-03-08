package module_07.home_work.Command;

public class TVOnCommand implements ICommand {
    private TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute(){
        tv.on();
    }

    public void undo(){
        tv.off();
    }
}