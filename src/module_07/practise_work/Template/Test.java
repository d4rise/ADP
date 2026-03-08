package module_07.practise_work.Template;

public class Test {

    public static void main(String[] args) {

        ReportGenerator pdf = new PdfReport();
        pdf.generateReport();

        ReportGenerator excel = new ExcelReport();
        excel.generateReport();

        ReportGenerator html = new HtmlReport();
        html.generateReport();
    }
}
