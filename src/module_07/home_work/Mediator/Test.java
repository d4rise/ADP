package module_07.home_work.Mediator;

public class Test {

    public static void main(String[] args) {

        ChatRoom chat = new ChatRoom();

        User user1 = new ChatUser(chat,"Askar");
        User user2 = new ChatUser(chat,"Biba");
        User user3 = new ChatUser(chat,"Chingiz");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user1.send("Hello everyone!");
        chat.privateMessage("Hi Biba!", user1, user2);
    }
}