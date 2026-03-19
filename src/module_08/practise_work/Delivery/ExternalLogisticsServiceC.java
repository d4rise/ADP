package module_08.practise_work.Delivery;

public class ExternalLogisticsServiceC {
    public void dispatch(String order) {
        System.out.println("C отправлять " + order);
    }

    public String status(String order) {
        return "C статус " + order;
    }
}
