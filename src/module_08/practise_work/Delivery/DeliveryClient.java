package module_08.practise_work.Delivery;

public class DeliveryClient {
    public static void main(String[] args) {

        IInternalDeliveryService service =
                DeliveryServiceFactory.getService("A");

        service.deliverOrder("123");
        System.out.println(service.getDeliveryStatus("123"));
        System.out.println("Расходы: " + service.calculateCost("123"));
    }
}
