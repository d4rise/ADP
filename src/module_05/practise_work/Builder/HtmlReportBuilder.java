package module_05.practise_work.Builder;

public class HtmlReportBuilder implements IReportBuilder {
    private Report report = new Report();

    public void setHeader(String header) {
        report.header = "<h1>" + header + "</h1>";
    }

    public void setFooter(String footer) {
        report.footer = "<footer>" + footer + "</footer>";
    }

    public void addSection(String name, String content) {
        report.sections.add("<h2>" + name + "</h2><p>" + content + "</p>");
    }

    public void setStyle(ReportStyle style) {
        report.style = style;
    }

    public Report getReport() {
        return report;
    }
}
