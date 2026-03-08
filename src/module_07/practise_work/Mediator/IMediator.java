
package module_07.practise_work.Mediator;

public interface IMediator {

    void sendMessage(String message, User user, String channel);

    void addUser(User user, String channel);
}
