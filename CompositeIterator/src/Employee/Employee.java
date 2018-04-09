package Employee;

import Iterator.NullIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee extends EmployeeComponent {

    private Iterator<EmployeeComponent> iterator;
    private ArrayList<EmployeeComponent> employeeComponents = new ArrayList<EmployeeComponent>();

    private String name;
    private Enum.DepartmentEnum department;
    private Enum.PositionEnum position;
    private int workYear;

    public Employee(String name, Enum.DepartmentEnum department, Enum.PositionEnum position, int workYear) {
        this.name = name;
        this.department = department;
        this.position = position;
        this.workYear = workYear;
    }

    public void add(EmployeeComponent employeeComponent) {
        employeeComponents.add(employeeComponent);
    }

    public void remove(EmployeeComponent employeeComponent) {
        employeeComponents.remove(employeeComponent);
    }

    public EmployeeComponent getChild(int i) {
        return employeeComponents.get(i);
    }

    public String getName() {
        return name;
    }

    @Override
    public Enum.DepartmentEnum getDepartment() {
        return department;
    }

    @Override
    public Enum.PositionEnum getPosition() {
        return position;
    }

    @Override
    public int getWorkYear() {
        return workYear;
    }

    @Override
    public Iterator<EmployeeComponent> createIterator() {

        return new NullIterator();
    }

    public void print() {

        System.out.print(getName() + " // " + getPosition()+" // " + getWorkYear()+"년");



    }

}


