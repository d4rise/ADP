package module_08.practise_work.Reports;

public class PdfExportDecorator extends ReportDecorator {

    public PdfExportDecorator(IReport report) {
        super(report);
    }

    @Override
    public String generate() {
        return super.generate() + " | Экспортировано в PDF";
    }
}
