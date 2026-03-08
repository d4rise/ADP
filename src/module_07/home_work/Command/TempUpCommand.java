package module_07.home_work.Command;

public class TempUpCommand implements ICommand {
    private Thermostat thermostat;

    public TempUpCommand(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    public void execute(){
        thermostat.increase();
    }

    public void undo(){
        thermostat.decrease();
    }
}