package module_03.practise_work;

class PickUpPointDelivery implements IDelivery {
    @Override
    public void deliverOrder(Order order) {
        System.out.println("Самовывоз из пункта выдачи");
    }
}
