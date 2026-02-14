package module_04.home_work;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Выберите тип транспорта:");
        System.out.println("1 - Car");
        System.out.println("2 - Motorcycle");
        System.out.println("3 - Truck");
        System.out.println("4 - Bus");

        int choice = sc.nextInt();
        sc.nextLine();

        VehicleFactory factory = null;

        switch (choice) {
            case 1 -> {
                System.out.print("Введите марку: ");
                String brand = sc.nextLine();
                System.out.print("Введите модель: ");
                String model = sc.nextLine();
                System.out.print("Введите тип топлива: ");
                String fuel = sc.nextLine();

                factory = new CarFactory(brand, model, fuel);
            }
            case 2 -> {
                System.out.print("Введите тип мотоцикла: ");
                String type = sc.nextLine();
                System.out.print("Введите объем двигателя: ");
                int volume = sc.nextInt();

                factory = new MotorcycleFactory(type, volume);
            }
            case 3 -> {
                System.out.print("Введите грузоподъемность (кг): ");
                int capacity = sc.nextInt();
                System.out.print("Введите количество осей: ");
                int axles = sc.nextInt();

                factory = new TruckFactory(capacity, axles);
            }
            case 4 -> {
                System.out.print("Введите количество мест: ");
                int seats = sc.nextInt();
                sc.nextLine();
                System.out.print("Введите тип маршрута (городской/междугородний): ");
                String route = sc.nextLine();

                factory = new BusFactory(seats, route);
            }
            default -> {
                System.out.println("Неверный выбор!");
                return;
            }
        }

        IVehicle vehicle = factory.createVehicle();
        vehicle.drive();
        vehicle.refuel();
    }
}
