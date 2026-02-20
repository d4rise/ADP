package module_05.practise_work.Builder;

public class ReportDirector {
    public void construct(IReportBuilder builder, ReportStyle style) {
        builder.setStyle(style);
        builder.setHeader("Azamats Report");
        builder.addSection("Sales", "Sales data...");
        builder.addSection("Finance", "Finance data...");
        builder.setFooter("Confidential");
    }
}
