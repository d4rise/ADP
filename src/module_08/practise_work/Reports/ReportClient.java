package module_08.practise_work.Reports;

public class ReportClient {

    public static IReport buildReport(boolean isSales, boolean filterDate, boolean sort, boolean filterAmount, boolean csv, boolean pdf) {

        IReport report = isSales ? new SalesReport() : new UserReport();

        if (filterDate) report = new DateFilterDecorator(report);
        if (sort) report = new SortingDecorator(report);
        if (filterAmount) report = new AmountFilterDecorator(report);
        if (csv) report = new CsvExportDecorator(report);
        if (pdf) report = new PdfExportDecorator(report);

        return report;
    }

    public static void main(String[] args) {
        IReport report = buildReport(true, true, true, true, true, false);
        System.out.println(report.generate());
    }
}
