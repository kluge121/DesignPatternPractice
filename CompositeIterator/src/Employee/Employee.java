package Employee;

import Iterator.NullIterator;

import java.util.*;

import Enum.PositionEnum;
import Enum.DepartmentEnum;

public class Employee extends EmployeeComponent {

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


    @Override
    public String getNmae() {
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
        System.out.println(getNmae() + " // " + getDepartment() + " // "
                + getPosition() + " // " + getWorkYear() + "년");
    }

    public void gatherEmployee(LinkedList<EmployeeComponent> employeelist) {
        System.out.println(getNmae() + " // " + getDepartment() + " // "
                + getPosition() + " // " + getWorkYear() + "년");
        if (!employeelist.contains(this)) {
            employeelist.add(this);
        }
    }
}


