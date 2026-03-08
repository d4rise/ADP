package module_07.home_work.Command;

public class TempDownCommand implements ICommand {
    private Thermostat thermostat;

    public TempDownCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    public void execute(){
        thermostat.decrease();
    }

    public void undo(){
        thermostat.increase();
    }
}