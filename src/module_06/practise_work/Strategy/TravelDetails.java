package module_06.practise_work.Strategy;

public class TravelDetails {

    private double distance;
    private String serviceClass;
    private int passengers;
    private boolean childDiscount;
    private boolean pensionerDiscount;
    private int baggageCount;

    public TravelDetails(double distance, String serviceClass,
                         int passengers,
                         boolean childDiscount,
                         boolean pensionerDiscount,
                         int baggageCount) {

        if (distance <= 0 || passengers <= 0)
            throw new IllegalArgumentException("Invalid input data!");

        this.distance = distance;
        this.serviceClass = serviceClass;
        this.passengers = passengers;
        this.childDiscount = childDiscount;
        this.pensionerDiscount = pensionerDiscount;
        this.baggageCount = baggageCount;
    }

    public double getDistance() { return distance; }
    public String getServiceClass() { return serviceClass; }
    public int getPassengers() { return passengers; }
    public boolean isChildDiscount() { return childDiscount; }
    public boolean isPensionerDiscount() { return pensionerDiscount; }
    public int getBaggageCount() { return baggageCount; }
}