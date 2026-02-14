package module_03.home_work.ISP;

public class AllInOnePrinter implements IPrinter {

    @Override
    public void print(String content) {
        System.out.println("Printing: " + content);
    }

//    @Override
//    public void scan(String content) {
//        System.out.println("Scanning: " + content);
//    }
//
//    @Override
//    public void fax(String content) {
//        System.out.println("Faxing: " + content);
//    }
}
