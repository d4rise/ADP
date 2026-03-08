
package module_07.practise_work.Mediator;

public class User {

    private String name;
    private IMediator mediator;
    private String channel;

    public User(String name, IMediator mediator, String channel){
        this.name = name;
        this.mediator = mediator;
        this.channel = channel;

        mediator.addUser(this, channel);
    }

    public String getName(){
        return name;
    }

    public void send(String message){
        mediator.sendMessage(message, this, channel);
    }

    public void receive(String message, String sender){
        System.out.println(sender + ": " + message);
    }
}
