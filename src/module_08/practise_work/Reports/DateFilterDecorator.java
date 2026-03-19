package module_08.practise_work.Reports;

public class DateFilterDecorator extends ReportDecorator {

    public DateFilterDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Отфильтровано по дате";
    }
}
