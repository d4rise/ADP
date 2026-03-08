package module_07.home_work.Mediator;

public interface IMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
    void privateMessage(String msg, User from, User to);
}