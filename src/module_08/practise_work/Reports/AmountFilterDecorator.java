package module_08.practise_work.Reports;

public class AmountFilterDecorator extends ReportDecorator {

    public AmountFilterDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Отфильтровано по сумме > 100";
    }
}
