package module_08.practise_work.Reports;

public class SortingDecorator extends ReportDecorator {

    public SortingDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Отсортировано";
    }
}
