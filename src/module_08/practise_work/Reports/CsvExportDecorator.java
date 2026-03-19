package module_08.practise_work.Reports;

public class CsvExportDecorator extends ReportDecorator {

    public CsvExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Экспортировано в CSV";
    }
}
