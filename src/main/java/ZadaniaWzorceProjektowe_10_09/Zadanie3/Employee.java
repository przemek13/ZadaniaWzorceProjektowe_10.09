package ZadaniaWzorceProjektowe_10_09.Zadanie3;

public abstract class Employee {
    protected final String name;
    protected final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    protected abstract String getEmployeeName();
    protected abstract int getEmployeeSalary();

    public void showMe() {
        System.out.println("Employee " + this.getEmployeeName() + " receives salary " + this.getEmployeeSalary () + " USD.");
    }

    public abstract void addChild(Employee p);
    public abstract void removeChild(Employee p);
}