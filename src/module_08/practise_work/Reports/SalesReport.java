package module_08.practise_work.Reports;

public class SalesReport implements IReport {
    @Override
    public String generate() {
        return "Данные о продажах: [100$, 200$, 50$, 400$]";
    }
}
