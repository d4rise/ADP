package module_05.practise_work.Builder;

public class Test {
    public static void main(String[] args) {

        ReportStyle style = new ReportStyle("white", "black", 14);

        IReportBuilder builder = new HtmlReportBuilder();
        ReportDirector director = new ReportDirector();

        director.construct(builder, style);

        Report report = builder.getReport();
        report.export();
    }
}
