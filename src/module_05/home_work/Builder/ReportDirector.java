package module_05.home_work.Builder;

public class ReportDirector {

    public void constructReport(IReportBuilder builder) {
        builder.setHeader("Yeragon Report");
        builder.setContent("Sales 20%");
        builder.setFooter("Confidential");
    }
}