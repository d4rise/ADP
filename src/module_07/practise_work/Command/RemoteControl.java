
package module_07.practise_work.Command;

import java.util.Stack;

public class RemoteControl {

    private ICommand command;
    private Stack<ICommand> history = new Stack<>();

    public void setCommand(ICommand command){
        this.command = command;
    }

    public void pressButton(){
        if(command != null){
            command.execute();
            history.push(command);
        }else{
            System.out.println("Command not assigned");
        }
    }

    public void undo(){
        if(!history.isEmpty()){
            ICommand last = history.pop();
            last.undo();
        }
    }
}
