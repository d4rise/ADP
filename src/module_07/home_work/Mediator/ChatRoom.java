package module_07.home_work.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements IMediator {

    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
        System.out.println(user.getName() + " joined the chat");
    }

    public void sendMessage(String msg, User sender){
        for(User u : users){
            if(u != sender){
                u.receive(msg, sender);
            }
        }
    }

    public void privateMessage(String msg, User from, User to){
        to.receive("(Private) " + msg, from);
    }
}