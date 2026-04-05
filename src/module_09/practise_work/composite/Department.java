package module_09.practise_work.composite;

import java.util.*;

public class Department extends OrganizationComponent {
    private String name;
    private List<OrganizationComponent> components = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    @Override
    public void add(OrganizationComponent c) {
        components.add(c);
    }

    @Override
    public void remove(OrganizationComponent c) {
        components.remove(c);
    }

    @Override
    public double getSalary() {
        double total = 0;
        for (OrganizationComponent c : components) {
            total += c.getSalary();
        }
        return total;
    }

    @Override
    public int getEmployeeCount() {
        int total = 0;
        for (OrganizationComponent c : components) {
            total += c.getEmployeeCount();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Отделение: " + name);
        for (OrganizationComponent c : components) {
            c.showDetails();
        }
    }
}
