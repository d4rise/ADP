package module_04.practise_work;

public class Report implements Document {
    @Override
    public void open() {
        System.out.println("Открыт документ: Отчет");
    }
}
