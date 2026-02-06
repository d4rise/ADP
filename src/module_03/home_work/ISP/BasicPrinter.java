package module_03.home_work.ISP;

public class BasicPrinter implements IPrinter {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }
}
