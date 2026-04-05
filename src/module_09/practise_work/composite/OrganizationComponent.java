package module_09.practise_work.composite;

public abstract class OrganizationComponent {
    public void add(OrganizationComponent c) { throw new UnsupportedOperationException(); }
    public void remove(OrganizationComponent c) { throw new UnsupportedOperationException(); }
    public double getSalary() { return 0; }
    public int getEmployeeCount() { return 0; }
    public void showDetails() {}
}
