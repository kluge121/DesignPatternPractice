package Employee;

import Iterator.NullIterator;

import java.util.*;

import Enum.PositionEnum;
import Enum.DepartmentEnum;

public class Employee extends EmployeeComponent {

    private Iterator<EmployeeComponent> iterator;
    private ArrayList<EmployeeComponent> employeeComponents = new ArrayList<EmployeeComponent>();

    private String name;
    private DepartmentEnum department;
    private PositionEnum position;
    private int workYear;

    public Employee(String name, DepartmentEnum department, PositionEnum position, int workYear) {
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
    public String getDepartment() {
        return department.toString();
    }

    @Override
    public PositionEnum getPosition() {
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

    @Override
    public void print() {
        System.out.println(getName() + " // " + getDepartment() + " // " + getPosition() + " // " + getWorkYear() + "년");
    }

    @Override
    public void gatherEmployee(LinkedList<EmployeeComponent> employeelist) {
        employeelist.add(this);
    }
}


