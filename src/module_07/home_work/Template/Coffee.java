package module_07.home_work.Template;
import java.util.Scanner;

public class Coffee extends Beverage{

    void brew(){
        System.out.println("Brewing coffee");
    }

    void addCondiments(){
        System.out.println("Adding sugar and milk");
    }

    boolean customerWantsCondiments(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Add milk and sugar? (yes/no)");
        String answer = sc.nextLine();
        return answer.equalsIgnoreCase("yes");
    }
}