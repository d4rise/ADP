package module_05.home_work.Prototype;

public class Discount implements Cloneable {

    private String description;
    private double percent;

    public Discount(String description, double percent) {
        this.description = description;
        this.percent = percent;
    }

    @Override
    protected Discount clone() {
        return new Discount(description, percent);
    }

    @Override
    public String toString() {
        return description + " - " + percent + "%";
    }
}