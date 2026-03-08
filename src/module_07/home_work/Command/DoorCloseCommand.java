package module_07.home_work.Command;

public class DoorCloseCommand implements ICommand {
    private Door door;

    public DoorCloseCommand(Door door){
        this.door = door;
    }

    public void execute(){
        door.close();
    }

    public void undo(){
        door.open();
    }
}