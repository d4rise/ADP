package module_09.practise_work.client;

import module_09.practise_work.facade.*;
import module_09.practise_work.composite.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("=== Fcd ===");
        HotelFacade hotel = new HotelFacade();
        hotel.bookRoomWithServices("Aza");
        hotel.organizeEvent("Конференция", "Erza");
        hotel.reserveTableWithTaxi("Shuga");

        System.out.println("\n=== Cmpste ===");
        Employee e1 = new Employee("Aibek", "Менеджер", 5000);
        Employee e2 = new Employee("Dana", "Разработчик", 3000);
        Contractor c1 = new Contractor("Temir", "Консультант", 2000);

        Department dev = new Department("Разработка");
        dev.add(e2);
        dev.add(c1);

        Department company = new Department("Компания");
        company.add(e1);
        company.add(dev);

        company.showDetails();

        System.out.println("Общая зарплата: " + company.getSalary());
        System.out.println("Всего сотрудников: " + company.getEmployeeCount());
    }
}
