package module_05.practise_work.Builder;

public class ReportStyle {
    private String background;
    private String fontColor;
    private int fontSize;

    public ReportStyle(String bg,  String font, int size) {
        this.background = bg;
        this.fontColor = font;
        this.fontSize = size;
    }

    public String GetBackground() {
        return background;
    }
    public String GetFontColor() {
        return fontColor;
    }
    public  int GetFontSize() {
        return fontSize;
    }
}
