package Employee;

import Enum.DepartmentEnum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import Iterator.CompositeIterator;

public class Department extends EmployeeComponent {


    private String name;
    private DepartmentEnum departmentEnum;

    private Iterator<EmployeeComponent> iterator;
    private ArrayList<EmployeeComponent> employeeComponents = new ArrayList<>();

    public Department(String name, DepartmentEnum departmentEnum) {
        this.name = name;
        this.departmentEnum = departmentEnum;
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

    @Override
    public String getDepartment() {
        return departmentEnum.toString();
    }

    @Override
    public Iterator<EmployeeComponent> createIterator() {
        if (iterator == null)
            iterator = new CompositeIterator(employeeComponents.iterator());
        return iterator;
    }

    public void print() {
        System.out.println("\n\n\n" + name);
        System.out.println("----------------------------");

        Iterator<EmployeeComponent> iterator = employeeComponents.iterator();
        while (iterator.hasNext()) {
            EmployeeComponent employeeComponent = iterator.next();
            employeeComponent.print();
        }

    }
    @Override
    public void gatherEmployee(LinkedList<EmployeeComponent> employeelist) {
        Iterator<EmployeeComponent> iterator = employeeComponents.iterator();
        while (iterator.hasNext()) {
            EmployeeComponent employeeComponent = iterator.next();
            employeeComponent.gatherEmployee(employeelist);
        }
    }
}
