package module_07.home_work.Mediator;

public abstract class User {

    protected IMediator mediator;
    protected String name;

    public User(IMediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public abstract void send(String message);
    public abstract void receive(String message, User sender);
}