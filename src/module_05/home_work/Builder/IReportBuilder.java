package module_05.home_work.Builder;

public interface IReportBuilder {

    void setHeader(String header);
    void setContent(String content);
    void setFooter(String footer);
    Report getReport();
}