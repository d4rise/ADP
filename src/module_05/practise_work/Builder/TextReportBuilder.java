package module_05.practise_work.Builder;

public class TextReportBuilder implements IReportBuilder {
    private Report report = new Report();

    public void setHeader(String header) {
        report.header = header;
    }

    public void setFooter(String footer) {
        report.footer = footer;
    }

    public void addSection(String name, String content) {
        report.sections.add(name + "\n" + content);
    }

    public void setStyle(ReportStyle style) {
        report.style = style;
    }

    public Report getReport() {
        return report;
    }
}
