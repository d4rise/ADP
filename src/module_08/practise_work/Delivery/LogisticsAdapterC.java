package module_08.practise_work.Delivery;

public class LogisticsAdapterC implements IInternalDeliveryService {

    private ExternalLogisticsServiceC service = new ExternalLogisticsServiceC();

    @Override
    public void deliverOrder(String orderId) {
        service.dispatch(orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return service.status(orderId);
    }

    @Override
    public double calculateCost(String orderId) {
        return 30.0;
    }
}
