
package module_07.practise_work.Mediator;

public class Test {

    public static void main(String[] args) {

        ChatMediator mediator = new ChatMediator();

        User u1 = new User("Almas", mediator, "java");
        User u2 = new User("Biba", mediator, "C#");
        User u3 = new User("Tema", mediator, "python");

        u1.send("Hello everyone!");
        u2.send("Hi Almas");
    }
}
