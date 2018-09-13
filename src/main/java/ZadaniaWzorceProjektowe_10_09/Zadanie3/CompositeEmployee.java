package ZadaniaWzorceProjektowe_10_09.Zadanie3;

import java.util.ArrayList;

public class CompositeEmployee extends Employee {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public CompositeEmployee(String name, int salary) {
        super(name,salary);
    }

    @Override
    protected String getEmployeeName() {
        return name;
    }

    @Override
    protected int getEmployeeSalary() {
        return salary;
    }

    @Override
    public void showMe() {
        super.showMe();
        for (Employee employee : employees) {
            employee.showMe();
        }
    }

    @Override
    public void addChild(Employee p) {
        employees.add(p);
    }

    @Override
    public void removeChild(Employee p) {
        employees.remove(p);
    }
}
