package module_03.practise_work;

class CourierDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Доставка курьером");
    }
}
