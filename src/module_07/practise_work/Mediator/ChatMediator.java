
package module_07.practise_work.Mediator;

import java.util.*;

public class ChatMediator implements IMediator {

    private Map<String, List<User>> channels = new HashMap<>();

    public void addUser(User user, String channel){

        channels.putIfAbsent(channel, new ArrayList<>());
        channels.get(channel).add(user);

        System.out.println(user.getName() + " joined " + channel);
    }

    public void sendMessage(String message, User sender, String channel){

        if(!channels.containsKey(channel)){
            System.out.println("Channel not found");
            return;
        }

        for(User user : channels.get(channel)){
            if(user != sender){
                user.receive(message, sender.getName());
            }
        }
    }
}
