package module_07.home_work.Command;
import java.util.Stack;

public class Invoker {

    private Stack<ICommand> history = new Stack<>();

    public void executeCommand(ICommand command){
        command.execute();
        history.push(command);
    }

    public void undo(){

        if(history.isEmpty()){
            System.out.println("No commands to undo!");
            return;
        }

        ICommand command = history.pop();
        command.undo();
    }
}