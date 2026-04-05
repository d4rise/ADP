package module_09.practise_work.facade;

public class HotelFacade {
    private RoomBookingSystem room = new RoomBookingSystem();
    private RestaurantSystem restaurant = new RestaurantSystem();
    private EventManagementSystem event = new EventManagementSystem();
    private CleaningService cleaning = new CleaningService();
    private TaxiService taxi = new TaxiService();

    public void bookRoomWithServices(String guest) {
        room.bookRoom(guest);
        restaurant.orderFood(guest);
        cleaning.scheduleCleaning("101");
    }

    public void organizeEvent(String name, String guest) {
        event.organizeEvent(name);
        room.bookRoom(guest);
    }

    public void reserveTableWithTaxi(String guest) {
        restaurant.reserveTable(guest);
        taxi.callTaxi(guest);
    }

    public void cancelBooking(String guest) {
        room.cancelBooking(guest);
    }
}
