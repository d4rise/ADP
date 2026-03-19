package module_08.practise_work.Delivery;

public interface IInternalDeliveryService {
    void deliverOrder(String orderId);
    String getDeliveryStatus(String orderId);
    double calculateCost(String orderId);
}
