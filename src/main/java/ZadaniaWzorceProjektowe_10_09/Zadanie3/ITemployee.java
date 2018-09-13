package ZadaniaWzorceProjektowe_10_09.Zadanie3;

public class ITemployee extends Employee {

    public  ITemployee (String name, int salary) {
        super(name, salary);
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
    public void addChild(Employee p) {
        throw new UnsupportedOperationException("not supported by ITemplyee!");
    }
    @Override
    public void removeChild(Employee p) {
        throw new UnsupportedOperationException("not supported by ITemplyee!");
    }
}
