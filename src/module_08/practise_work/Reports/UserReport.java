package module_08.practise_work.Reports;

public class UserReport implements IReport {
    @Override
    public String generate() {
        return "Пользователи: [Азамат, Бека, Ерза, Нурик]";
    }
}
