package module_08.practise_work.Delivery;

public class DeliveryServiceFactory {

    public static IInternalDeliveryService getService(String type) {
        switch (type) {
            case "A": return new LogisticsAdapterA();
            case "B": return new LogisticsAdapterB();
            case "C": return new LogisticsAdapterC();
            default: return new InternalDeliveryService();
        }
    }
}
