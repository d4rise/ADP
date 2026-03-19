package module_08.practise_work.Delivery;

public class LogisticsAdapterA implements IInternalDeliveryService {

    private ExternalLogisticsServiceA service = new ExternalLogisticsServiceA();

    @Override
    public void deliverOrder(String orderId) {
        try {
            service.shipItem(Integer.parseInt(orderId));
        } catch (Exception e) {
            System.out.println("Ошибка A: " + e.getMessage());
        }
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return service.trackShipment(Integer.parseInt(orderId));
    }

    @Override
    public double calculateCost(String orderId) {
        return 20.0;
    }
}
