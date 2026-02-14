package module_04.practise_work;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите тип документа:");
        System.out.println("1 - Report");
        System.out.println("2 - Resume");
        System.out.println("3 - Letter");
        System.out.println("4 - Invoice");

        int choice = sc.nextInt();

        DocumentCreator creator;

        switch (choice) {
            case 1 -> creator = new ReportCreator();
            case 2 -> creator = new ResumeCreator();
            case 3 -> creator = new LetterCreator();
            case 4 -> creator = new InvoiceCreator();
            default -> {
                System.out.println("Неверный выбор!");
                return;
            }
        }

        creator.openDocument();
    }
}
