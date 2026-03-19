package module_08.practise_work.Delivery;

public class ExternalLogisticsServiceA {
    public void shipItem(int id) {
        System.out.println("A отгрузка товара " + id);
    }

    public String trackShipment(int id) {
        return "A отслеживание " + id;
    }
}
