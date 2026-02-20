package module_05.practise_work.Builder;

public interface IReportBuilder {

    void setHeader(String header);
    void setFooter(String footer);
    void addSection(String name, String content);
    void setStyle(ReportStyle style);
    Report getReport();
}
