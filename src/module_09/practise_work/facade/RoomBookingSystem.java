package module_09.practise_work.facade;

public class RoomBookingSystem {
    public void bookRoom(String guest) {
        System.out.println("Номер забронирован на " + guest);
    }

    public void cancelBooking(String guest) {
        System.out.println("Бронирование отменено на " + guest);
    }
}
