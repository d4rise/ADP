package module_04.home_work;

public class Truck implements IVehicle {
    private int capacity;
    private int axles;

    public Truck(int capacity, int axles) {
        this.capacity = capacity;
        this.axles = axles;
    }

    @Override
    public void drive() {
        System.out.println("Грузовик с грузоподъемностью " + capacity + " кг и " + axles + " осями едет");
    }

    @Override
    public void refuel() {
        System.out.println("Заправка грузовика");
    }
}
