package module_04.practise_work;

public class Invoice implements Document {
    @Override
    public void open() {
        System.out.println("Открыт документ: Счет (Invoice)");
    }
}
