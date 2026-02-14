package module_04.practise_work;

public class Resume implements Document {
    @Override
    public void open() {
        System.out.println("Открыт документ: Резюме");
    }
}
