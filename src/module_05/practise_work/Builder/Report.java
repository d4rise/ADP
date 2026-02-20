package module_05.practise_work.Builder;
import java.util.*;

public class Report {

    String header;
    String footer;
    List<String> sections = new ArrayList<>();
    ReportStyle style;

    public void export() {
        System.out.println(header);
        sections.forEach(System.out::println);
        System.out.println(footer);
    }
}
