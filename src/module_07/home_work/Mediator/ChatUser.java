package module_07.home_work.Mediator;

public class ChatUser extends User {

    public ChatUser(IMediator mediator, String name){
        super(mediator, name);
    }

    public void send(String message){
        mediator.sendMessage(message, this);
    }

    public void receive(String message, User sender){
        System.out.println(sender.getName() + " -> " + name + ": " + message);
    }
}