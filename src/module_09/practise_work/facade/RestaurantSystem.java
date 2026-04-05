package module_09.practise_work.facade;

public class RestaurantSystem {
    public void reserveTable(String guest) {
        System.out.println("Стол зарезервирован для " + guest);
    }

    public void orderFood(String guest) {
        System.out.println("Еда заказана на " + guest);
    }
}
