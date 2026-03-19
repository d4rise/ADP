package module_08.practise_work.Delivery;

public class InternalDeliveryService implements IInternalDeliveryService {

    @Override
    public void deliverOrder(String orderId) {
        System.out.println("Внутренняя доставка: " + orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return "Доставляется внутри компании";
    }

    @Override
    public double calculateCost(String orderId) {
        return 10.0;
    }
}
