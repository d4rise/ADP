package module_05.home_work.Builder;

public class TextReportBuilder implements IReportBuilder {

    private Report report;

    public TextReportBuilder() {
        report = new Report();
    }

    @Override
    public void setHeader(String header) {
        report.setHeader("HEADER: " + header);
    }

    @Override
    public void setContent(String content) {
        report.setContent("CONTENT: " + content);
    }

    @Override
    public void setFooter(String footer) {
        report.setFooter("FOOTER: " + footer);
    }

    @Override
    public Report getReport() {
        return report;
    }
}