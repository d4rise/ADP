package module_08.practise_work.Delivery;

public class LogisticsAdapterB implements IInternalDeliveryService {

    private ExternalLogisticsServiceB service = new ExternalLogisticsServiceB();

    @Override
    public void deliverOrder(String orderId) {
        service.sendPackage(orderId);
    }

    @Override
    public String getDeliveryStatus(String orderId) {
        return service.checkPackageStatus(orderId);
    }

    @Override
    public double calculateCost(String orderId) {
        return 25.0;
    }
}
