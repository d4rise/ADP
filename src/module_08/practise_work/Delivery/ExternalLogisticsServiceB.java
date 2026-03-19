package module_08.practise_work.Delivery;

public class ExternalLogisticsServiceB {
    public void sendPackage(String info) {
        System.out.println("B отправка " + info);
    }

    public String checkPackageStatus(String code) {
        return "B статус " + code;
    }
}
