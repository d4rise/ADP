package module_09.practise_work.composite;

public class Contractor extends Employee {
    public Contractor(String name, String position, double salary) {
        super(name, position, salary);
    }

    @Override
    public double getSalary() {
        return 0;
    }
}
